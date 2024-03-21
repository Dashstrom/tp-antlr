package fr.dashstrom.model;

import org.antlr.v4.runtime.tree.RuleNode;

import fr.dashstrom.parsing.LogoBaseVisitor;

public class LogoStoppableTreeVisitor extends LogoBaseVisitor<Integer> {
	/**
	 * Flag to continue or not the exploration of the Tree.
	 */
	private boolean continueIteration = true;

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, Integer currentResult) {
		return super.shouldVisitNextChild(node, currentResult) && continueIteration;
	}

	protected void stopIteration() {
		continueIteration = false;
	}

	protected void continueIteration() {
		continueIteration = true;
	}
}
