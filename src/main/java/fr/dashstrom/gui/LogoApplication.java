package fr.dashstrom.gui;

import fr.dashstrom.utils.ResourceUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LogoApplication extends Application {
	String url = "file:icon/26411.png";

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ResourceUtils.getResourceURL("/view/logoview.fxml"));
		Parent root = loader.load();
		LogoController controller = loader.getController();
		stage.setTitle("Logo Application");
		Scene scene = new Scene(root, 1200, 600);
		stage.setScene(scene);
		stage.getIcons().add(new Image(url));
		scene.getStylesheets().add(ResourceUtils.getResourceURL("/css/stylesheet.css").toExternalForm());

		stage.show();
		stage.setOnCloseRequest(evt -> controller.closeApplication());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
