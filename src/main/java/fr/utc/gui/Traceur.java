/*
  * Created on 12 may. 2018
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.utc.gui;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;

public class Traceur {
	private Color couleur = Color.BLACK;
	private double initx = 350, inity = 350; // position initiale
	private double posx = initx, posy = inity; // position courante
	private double angle = 90;
	private double teta;
	ObjectProperty<GraphLineParameter> line;

	public Traceur() {
		setTeta();
		line = new SimpleObjectProperty<GraphLineParameter>();
	}

	public ObjectProperty<GraphLineParameter> lineProperty() {
		return line;
	}

	private void setTeta() {
		teta = Math.toRadians(angle);
	}

	private void addLine(double x1, double y1, double x2, double y2) {
		line.setValue(new GraphLineParameter(x1, y1, x2, y2, couleur));
	}

	public void avance(double r) {
		double a = posx + r * Math.cos(teta);
		double b = posy - r * Math.sin(teta);
		addLine(posx, posy, a, b);

		posx = a;
		posy = b;
	}

	public void td(double r) {
		angle = (angle - r) % 360;
		setTeta();
	}

}
