package fr.utc.model;

import org.antlr.v4.runtime.tree.RuleNode;

import fr.utc.parsing.LogoBaseVisitor;

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
