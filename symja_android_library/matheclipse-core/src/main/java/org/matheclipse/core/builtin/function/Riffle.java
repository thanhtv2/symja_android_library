package org.matheclipse.core.builtin.function;

import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractCoreFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;

public class Riffle extends AbstractCoreFunctionEvaluator {

	public Riffle() {
		super();
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkSize(ast, 3);

		IExpr arg1 = F.eval(ast.arg1());
		IExpr arg2 = F.eval(ast.arg2());
		if (arg1.isAST()) {
			IAST list = (IAST) arg1;
			if (arg2.isAST()) {
				return riffleAST(list, (IAST) arg2);
			} else {
				return riffleAtom(list, arg2);
			}
		}
		return null;
	}

	public static IExpr riffleAtom(IAST arg1, IExpr arg2) {
		if (arg1.size() < 2) {
			return arg1;
		}
		IAST result = arg1.copyHead();
		for (int i = 1; i < arg1.size() - 1; i++) {
			result.add(arg1.get(i));
			result.add(arg2);
		}
		result.add(arg1.get(arg1.size() - 1));
		return result;
	}

	public static IAST riffleAST(IAST arg1, IAST arg2) {
		if (arg1.size() < 2) {
			return arg1;
		}
		IAST result = arg1.copyHead();
		if (arg2.size() < 2) {
			return arg1;
		}
		int j = 1;
		for (int i = 1; i < arg1.size() - 1; i++) {
			result.add(arg1.get(i));
			if (j < arg2.size()) {
				result.add(arg2.get(j++));
			} else {
				j = 1;
				result.add(arg2.get(j++));
			}
		}
		result.add(arg1.get(arg1.size() - 1));
		if (j < arg2.size()) {
			result.add(arg2.get(j++));
		}
		return result;
	}
}
