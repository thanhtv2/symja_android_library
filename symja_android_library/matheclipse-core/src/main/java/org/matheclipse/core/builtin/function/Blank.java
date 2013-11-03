package org.matheclipse.core.builtin.function;

import org.matheclipse.core.eval.interfaces.AbstractCoreFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

public class Blank extends AbstractCoreFunctionEvaluator {
	public final static Blank CONST = new Blank();

	public Blank() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		if (ast.size() == 1) {
			return F.$p((ISymbol) null);
		}
		if (ast.size() == 2) {
			return F.$p((ISymbol) null, F.eval(ast.arg1()));
		}
		return null;
	}

	@Override
	public void setUp(ISymbol symbol) {
		symbol.setAttributes(ISymbol.HOLDALL);
	}
}
