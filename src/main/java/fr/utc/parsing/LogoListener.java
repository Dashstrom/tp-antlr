// Generated from Logo.g4 by ANTLR 4.3
package fr.utc.parsing;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterTd(@NotNull LogoParser.TdContext ctx);

	/**
	 * Exit a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitTd(@NotNull LogoParser.TdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_instructions}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);

	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAv(@NotNull LogoParser.AvContext ctx);

	/**
	 * Exit a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAv(@NotNull LogoParser.AvContext ctx);

	/**
	 * Enter a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterParenthese(@NotNull LogoParser.ParentheseContext ctx);

	/**
	 * Exit a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitParenthese(@NotNull LogoParser.ParentheseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link LogoParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull LogoParser.FloatContext ctx);

	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LogoParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull LogoParser.FloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#programme}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterProgramme(@NotNull LogoParser.ProgrammeContext ctx);

	/**
	 * Exit a parse tree produced by {@link LogoParser#programme}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitProgramme(@NotNull LogoParser.ProgrammeContext ctx);
}