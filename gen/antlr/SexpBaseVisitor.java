// Generated from D:/������/�����/��-3 ���������������� ���� �� ������ S-���������/Klang_mvn/src/main/java/antlr\Sexp.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link SexpVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class SexpBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements SexpVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProgram(SexpParser.ProgramContext ctx) { return visitChildren(ctx); }
}