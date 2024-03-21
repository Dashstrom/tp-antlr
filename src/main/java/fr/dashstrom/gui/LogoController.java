package fr.dashstrom.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import org.antlr.v4.gui.TreeViewer;

import fr.dashstrom.model.LogoGraphModel;
import fr.dashstrom.model.LogoTreeVisitor;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LogoController {
	private static int W = 900, H = 450;

	@FXML
	Slider scaleSlider;
	@FXML
	TextArea program, logArea;
	@FXML
	Button run, clrView, clrLog, stop;
	@FXML
	AnchorPane view;
	@FXML
	TabPane resultPane;
	@FXML
	SwingNode swingNode;
	@FXML
	Canvas canvas;
	@FXML
	TextField sleep;
	private JPanel jTreeViewPane = null; // pane for tree and slider
	private JScrollPane jScrollASTPane = null; // panel with AST tree
	private TreeViewer viewer = null;

	LogoGraphContext logoGraphContext;
	LogoTreeVisitor visitor;
	ExecutorService pool;

	public void initialize() {
		createSwingContent();
		canvas.setWidth(1000);
		canvas.setHeight(1000);
		// Construit l'instance qui gère l'affichage progressif des tracés
		// dans le canvas
		logoGraphContext = new LogoGraphContext(canvas.getGraphicsContext2D());
		sleep.setText(logoGraphContext.getThreadSleep());
		pool = Executors.newFixedThreadPool(2);

	}

	public void runParser() {
		String prog = program.getText();
		if (prog.length() > 0) {
			LogoGraphModel model = new LogoGraphModel(prog);
			viewer = new TreeViewer(model.getRules(), model.getTree());
			int sliderValue = (int) ((viewer.getScale() - 1.0) * 1000);
			scaleSlider.setValue(sliderValue);
			getJScrollASTPane().setViewportView(viewer);
			// La visite de l'arbre se fait dans un thread à part
			// pour permettre un affichage progressif dans le canvas
			setSleepTime();
			model.addListeners(appendLog(), (observable, oldVal, newVal) -> traceLine(newVal));
			pool.execute(() -> model.visit());
		}
	}

	private ChangeListener<String> appendLog() {
		ChangeListener<String> f = (observable, oldVal, newVal) -> Platform.runLater(() -> logArea.appendText(newVal));
		// ChangeListener<String> f = (observable, oldVal, newVal) ->
		// System.out.println(newVal);
		return f;
	}

	private void traceLine(GraphLineParameter gp) {
		logoGraphContext.addLine(gp);
	}

	public void clearView() {
		canvas.getGraphicsContext2D().clearRect(0, 0, 1000, 1000);
	}

	public void clearLog() {
		logArea.clear();
	}

	public void stop() {
		logoGraphContext.stop();
	}

	// Définit le temps d'attente en ms entre affichages successifs de lignes
	public void setSleepTime() {
		int mstime = Integer.parseInt(sleep.getText());
		logoGraphContext.setThreadSleep(mstime);
	}

	private void createSwingContent() {
		SwingUtilities.invokeLater(() -> swingNode
				.setContent(getjTreeViewPane()));
	}

	public void closeApplication() {
		pool.shutdown();
		logoGraphContext.shutDown();
		System.exit(0);
	}

	public JPanel getjTreeViewPane() {
		if (jTreeViewPane == null) {
			jTreeViewPane = new JPanel();
			jTreeViewPane.setMaximumSize(new Dimension(W, H));
			jTreeViewPane.setLayout(new BorderLayout());
			jTreeViewPane.add(getJScrollASTPane(), BorderLayout.CENTER);
			scaleSlider.setValue(0);
			scaleSlider.valueProperty().addListener((obs, oldv, newval) -> {
				if (viewer != null)
					viewer.setScale((double) newval / 1000.0 + 1.0);
			});

		}
		return jTreeViewPane;
	}

	private JScrollPane getJScrollASTPane() {
		if (jScrollASTPane == null) {
			jScrollASTPane = new JScrollPane();
		}
		return jScrollASTPane;
	}

}
