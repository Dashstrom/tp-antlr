package fr.dashstrom.model;

import org.antlr.v4.runtime.ParserRuleContext;

import javafx.beans.property.SimpleStringProperty;

public class Log extends SimpleStringProperty {

	public Log() {

	}

	/*
	 * Log facilities
	 */
	private int ruleLine(ParserRuleContext rule) {
		return rule.start.getLine();
	}

	public void defaultLog(ParserRuleContext rule) {
		setValue(String.format("Ligne : %d, %s \n", ruleLine(rule), rule.getText()));
		setValue("");
	}

	public void appendLog(String... others) {
		setValue(String.join(" ", others) + "\n");
	}
}
