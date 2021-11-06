// Generated from D:/Универ/Конфа/ДЗ-3 Конфигурационный язык на основе S-выражений/Klang_mvn/src/main/java/antlr\Sexp.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SexpParser}.
 */
public interface SexpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SexpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SexpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SexpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SexpParser.ProgramContext ctx);
}