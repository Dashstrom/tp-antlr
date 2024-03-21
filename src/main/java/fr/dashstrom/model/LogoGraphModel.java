package fr.dashstrom.model;

import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import fr.dashstrom.gui.GraphLineParameter;
import fr.dashstrom.parsing.LogoLexer;
import fr.dashstrom.parsing.LogoParser;
import fr.dashstrom.parsing.LogoParser.ProgrammeContext;
import javafx.beans.value.ChangeListener;

public class LogoGraphModel {
	String program;
	List<String> rules;
	ProgrammeContext tree;
	LogoTreeVisitor visitor;

	public LogoGraphModel(String program) {
		this.program = program;
		initialize();
	}

	public void initialize() {
		CharStream str = CharStreams.fromString(program);
		LogoLexer lexer = new LogoLexer(str);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LogoParser parser = new LogoParser(tokens);
		tree = parser.programme();
		rules = Arrays.asList(parser.getRuleNames());
		visitor = new LogoTreeVisitor();
	}

	public void visit() {
		visitor.visit(tree);
	}

	public void addListeners(ChangeListener<String> logListener, ChangeListener<GraphLineParameter> lineListener) {
		visitor.logProperty().addListener(logListener);
		visitor.getTraceur().lineProperty().addListener(lineListener);
	}

	public List<String> getRules() {
		return rules;
	}

	public ProgrammeContext getTree() {
		return tree;
	}

	public LogoTreeVisitor getVisitor() {
		return visitor;
	}

}
