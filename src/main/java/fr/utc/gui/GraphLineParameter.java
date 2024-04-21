package fr.utc.gui;

import javafx.scene.paint.Color;

public class GraphLineParameter {
	/*
	 * 5 Paramètres pour tracer un segment en couleur
	 */
	public double initX, initY, endX, endY;
	public Color color;

	public GraphLineParameter(double initX, double initY, double endX, double endY, Color color) {
		this.initX = initX;
		this.initY = initY;
		this.endX = endX;
		this.endY = endY;
		this.color = color;
	}

}
