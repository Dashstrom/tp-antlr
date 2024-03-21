package fr.dashstrom.gui;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.scene.canvas.GraphicsContext;

public class LogoGraphContext {
	// Pause entre 2 accès à la queue des lignes
	private int thread_sleep = 3;
	// Queue où sont placés les quadruplets pour les tracés
	ConcurrentLinkedQueue<GraphLineParameter> lineQueue = new ConcurrentLinkedQueue<>();
	// GraphicsContext associé au canvas de l'interface graphique
	GraphicsContext gclocal;
	ExecutorService pool;

	public LogoGraphContext(GraphicsContext gclocal) {
		this.gclocal = gclocal;
		pool = Executors.newFixedThreadPool(2);
		// Lance la tâche qui effectue les tracés à partir des GraphParameters de la
		// queue
		pool.execute(drawTask);
	}

	public void addLine(GraphLineParameter gp) {
		lineQueue.add(gp);
	}

	public void stop() {
		lineQueue.clear();
	}

	public void setThreadSleep(int mstime) {
		thread_sleep = mstime;
	}

	public String getThreadSleep() {
		return String.valueOf(thread_sleep);
	}

	public void shutDown() {
		pool.shutdown();
	}

	Runnable drawTask = () -> {
		while (true) {
			GraphLineParameter gp = lineQueue.poll();
			if (gp != null) {
				gclocal.setStroke(gp.color);
				gclocal.strokeLine(gp.initX, gp.initY, gp.endX, gp.endY);

				try {
					Thread.sleep(thread_sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
}
