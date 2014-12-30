package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules94 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(CN1,e,Power($s("F"),Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1))),And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))))),
ISetDelayed(Int(Times(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(e,Power($s("F"),Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1))),And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),n),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(CN1,e,n,Power($s("F"),Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Sin(Plus(d,Times(e,x))),Plus(n,Times(CN1,C1))),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(n,Plus(n,Times(CN1,C1)),Sqr(e),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),Plus(n,Times(CN1,C2)))),x))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))),RationalQ(n)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Plus(Times(b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(Times(Sqr(e),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(e,m,Power($s("F"),Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Cos(Plus(d,Times(e,x))),Plus(m,Times(CN1,C1))),Power(Plus(Times(Sqr(e),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(m,Plus(m,Times(CN1,C1)),Sqr(e),Power(Plus(Times(Sqr(e),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),Plus(m,Times(CN1,C2)))),x))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Times(Sqr(e),Sqr(m)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C2)),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),CN1)),Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C1)),Power(Times(e,Plus(n,C1)),CN1))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))),NonzeroQ(Plus(n,C1))),NonzeroQ(Plus(n,C2))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C2)),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),CN1)),Times(CN1,Power($s("F"),Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C1)),Power(Times(e,Plus(n,C1)),CN1))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))),NonzeroQ(Plus(n,C1))),NonzeroQ(Plus(n,C2))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C2)),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),CN1)),Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C1)),Power(Times(e,Plus(n,C1)),CN1)),Times(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),Plus(n,C2))),x))),And(And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))),RationalQ(n)),Less(n,CN1)),Unequal(n,CN2)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C2)),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),CN1)),Times(CN1,Power($s("F"),Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C1)),Power(Times(e,Plus(n,C1)),CN1)),Times(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),Power(Times(Sqr(e),Plus(n,C1),Plus(n,C2)),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),Plus(n,C2))),x))),And(And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Times(Sqr(e),Sqr(Plus(n,C2))),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))),RationalQ(n)),Less(n,CN1)),Unequal(n,CN2)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Times(Power(E,Times(CI,n,Plus(d,Times(e,x)))),Power(Sin(Plus(d,Times(e,x))),n),Power(Power(Plus(CN1,Power(E,Times(C2,CI,Plus(d,Times(e,x))))),n),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Plus(CN1,Power(E,Times(C2,CI,Plus(d,Times(e,x))))),n),Power(Power(E,Times(CI,n,Plus(d,Times(e,x)))),CN1)),x)),And(FreeQ(List($s("F"),a,b,c,d,e,n),x),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Times(Power(E,Times(CI,n,Plus(d,Times(e,x)))),Power(Cos(Plus(d,Times(e,x))),n),Power(Power(Plus(C1,Power(E,Times(C2,CI,Plus(d,Times(e,x))))),n),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Power(E,Times(C2,CI,Plus(d,Times(e,x))))),n),Power(Power(E,Times(CI,n,Plus(d,Times(e,x)))),CN1)),x)),And(FreeQ(List($s("F"),a,b,c,d,e,n),x),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Tan(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(CI,n),Int(ExpandIntegrand(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Times(CN1,Power(E,Times(C2,CI,Plus(d,Times(e,x)))))),n),Power(Power(Plus(C1,Power(E,Times(C2,CI,Plus(d,Times(e,x))))),n),CN1)),x),x)),And(FreeQ(List($s("F"),a,b,c,d,e),x),IntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cot(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(CN1,CI),n),Int(ExpandIntegrand(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Plus(C1,Power(E,Times(C2,CI,Plus(d,Times(e,x))))),n),Power(Power(Plus(C1,Times(CN1,Power(E,Times(C2,CI,Plus(d,Times(e,x)))))),n),CN1)),x),x)),And(FreeQ(List($s("F"),a,b,c,d,e),x),IntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sec(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),n),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(CN1,e,n,Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,C1)),Sin(Plus(d,Times(e,x))),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(Sqr(e),n,Plus(n,C1),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,C2))),x))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))),RationalQ(n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Csc(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),n),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(e,n,Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,C1)),Cos(Plus(d,Times(e,x))),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1)),Times(Sqr(e),n,Plus(n,C1),Power(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,C2))),x))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Times(Sqr(e),Sqr(n)),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))))),RationalQ(n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sec(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Times(CN1,C2))),Power(Times(Sqr(e),Plus(n,Times(CN1,C1)),Plus(n,Times(CN1,C2))),CN1)),Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Times(CN1,C1))),Sin(Plus(d,Times(e,x))),Power(Times(e,Plus(n,Times(CN1,C1))),CN1))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log($s("F")))),Times(Sqr(e),Sqr(Plus(n,Times(CN1,C2))))))),NonzeroQ(Plus(n,Times(CN1,C1)))),NonzeroQ(Plus(n,Times(CN1,C2)))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Csc(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Times(CN1,C2))),Power(Times(Sqr(e),Plus(n,Times(CN1,C1)),Plus(n,Times(CN1,C2))),CN1)),Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Times(CN1,C1))),Cos(Plus(d,Times(e,x))),Power(Times(e,Plus(n,Times(CN1,C1))),CN1))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log($s("F")))),Times(Sqr(e),Sqr(Plus(n,Times(CN1,C2))))))),NonzeroQ(Plus(n,Times(CN1,C1)))),NonzeroQ(Plus(n,Times(CN1,C2)))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sec(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Times(CN1,C2))),Power(Times(Sqr(e),Plus(n,Times(CN1,C1)),Plus(n,Times(CN1,C2))),CN1)),Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Times(CN1,C1))),Sin(Plus(d,Times(e,x))),Power(Times(e,Plus(n,Times(CN1,C1))),CN1)),Times(Plus(Times(Sqr(e),Sqr(Plus(n,Times(CN1,C2)))),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),Power(Times(Sqr(e),Plus(n,Times(CN1,C1)),Plus(n,Times(CN1,C2))),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sec(Plus(d,Times(e,x))),Plus(n,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log($s("F")))),Times(Sqr(e),Sqr(Plus(n,Times(CN1,C2))))))),RationalQ(n)),Greater(n,C1)),Unequal(n,C2)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Csc(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,c,Log($s("F")),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Times(CN1,C2))),Power(Times(Sqr(e),Plus(n,Times(CN1,C1)),Plus(n,Times(CN1,C2))),CN1)),Times(CN1,Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Times(CN1,C1))),Cos(Plus(d,Times(e,x))),Power(Times(e,Plus(n,Times(CN1,C1))),CN1)),Times(Plus(Times(Sqr(e),Sqr(Plus(n,Times(CN1,C2)))),Times(Sqr(b),Sqr(c),Sqr(Log($s("F"))))),Power(Times(Sqr(e),Plus(n,Times(CN1,C1)),Plus(n,Times(CN1,C2))),CN1),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Csc(Plus(d,Times(e,x))),Plus(n,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),NonzeroQ(Plus(Times(Sqr(b),Sqr(c),Sqr(Log($s("F")))),Times(Sqr(e),Sqr(Plus(n,Times(CN1,C2))))))),RationalQ(n)),Greater(n,C1)),Unequal(n,C2)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sec(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(C2,n),Power(E,Times(CI,n,Plus(d,Times(e,x)))),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Plus(Times(CI,e,n),Times(b,c,Log($s("F")))),CN1),Hypergeometric2F1(n,Plus(Times(C1D2,n),Times(CN1,CI,b,c,Log($s("F")),Power(Times(C2,e),CN1))),Plus(C1,Times(C1D2,n),Times(CN1,CI,b,c,Log($s("F")),Power(Times(C2,e),CN1))),Times(CN1,Power(E,Times(C2,CI,Plus(d,Times(e,x))))))),And(FreeQ(List($s("F"),a,b,c,d,e),x),IntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Csc(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(CN2,CI),n),Power(E,Times(CI,n,Plus(d,Times(e,x)))),Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Plus(Times(CI,e,n),Times(b,c,Log($s("F")))),CN1),Hypergeometric2F1(n,Plus(Times(C1D2,n),Times(CN1,CI,b,c,Log($s("F")),Power(Times(C2,e),CN1))),Plus(C1,Times(C1D2,n),Times(CN1,CI,b,c,Log($s("F")),Power(Times(C2,e),CN1))),Power(E,Times(C2,CI,Plus(d,Times(e,x)))))),And(FreeQ(List($s("F"),a,b,c,d,e),x),IntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sec(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(C1,Power(E,Times(C2,CI,Plus(d,Times(e,x))))),n),Power(Sec(Plus(d,Times(e,x))),n),Power(Power(E,Times(CI,n,Plus(d,Times(e,x)))),CN1),Int(SimplifyIntegrand(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(E,Times(CI,n,Plus(d,Times(e,x)))),Power(Power(Plus(C1,Power(E,Times(C2,CI,Plus(d,Times(e,x))))),n),CN1)),x),x)),And(FreeQ(List($s("F"),a,b,c,d,e),x),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Csc(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(C1,Times(CN1,Power(E,Times(CN2,CI,Plus(d,Times(e,x)))))),n),Power(Csc(Plus(d,Times(e,x))),n),Power(Power(E,Times(CN1,CI,n,Plus(d,Times(e,x)))),CN1),Int(SimplifyIntegrand(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(E,Times(CN1,CI,n,Plus(d,Times(e,x)))),Power(Power(Plus(C1,Times(CN1,Power(E,Times(CN2,CI,Plus(d,Times(e,x)))))),n),CN1)),x),x)),And(FreeQ(List($s("F"),a,b,c,d,e),x),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(f_,Times(g_DEFAULT,Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(C2,n),Power(f,n),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(Times(C1D2,d),Times(e,C1D2,x),Times(CN1,f,Pi,Power(Times(C4,g),CN1)))),Times(C2,n))),x)),And(And(FreeQ(List($s("F"),a,b,c,d,e,f,g),x),ZeroQ(Plus(Sqr(f),Times(CN1,Sqr(g))))),NegativeIntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(f_,Times(g_DEFAULT,Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(C2,n),Power(f,n),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(Times(C1D2,d),Times(e,C1D2,x))),Times(C2,n))),x)),And(And(FreeQ(List($s("F"),a,b,c,d,e,f,g),x),ZeroQ(Plus(f,Times(CN1,g)))),NegativeIntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(f_,Times(g_DEFAULT,Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(C2,n),Power(f,n),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(Times(C1D2,d),Times(e,C1D2,x))),Times(C2,n))),x)),And(And(FreeQ(List($s("F"),a,b,c,d,e,f,g),x),ZeroQ(Plus(f,g))),NegativeIntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(g,n),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Tan(Plus(Times(f,Pi,Power(Times(C4,g),CN1)),Times(CN1,C1D2,d),Times(CN1,e,C1D2,x))),m)),x)),And(And(And(FreeQ(List($s("F"),a,b,c,d,e,f,g),x),ZeroQ(Plus(Sqr(f),Times(CN1,Sqr(g))))),IntegersQ(m,n)),Equal(Plus(m,n),C0)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(f,n),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Tan(Plus(Times(C1D2,d),Times(e,C1D2,x))),m)),x)),And(And(And(FreeQ(List($s("F"),a,b,c,d,e,f,g),x),ZeroQ(Plus(f,Times(CN1,g)))),IntegersQ(m,n)),Equal(Plus(m,n),C0)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(f,n),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Cot(Plus(Times(C1D2,d),Times(e,C1D2,x))),m)),x)),And(And(And(FreeQ(List($s("F"),a,b,c,d,e,f,g),x),ZeroQ(Plus(f,g))),IntegersQ(m,n)),Equal(Plus(m,n),C0)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Plus(h_,Times(i_DEFAULT,Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(f_,Times(g_DEFAULT,Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(C2,i,Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Cos(Plus(d,Times(e,x))),Power(Plus(f,Times(g,Sin(Plus(d,Times(e,x))))),CN1)),x)),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Plus(h,Times(CN1,i,Cos(Plus(d,Times(e,x))))),Power(Plus(f,Times(g,Sin(Plus(d,Times(e,x))))),CN1)),x)),And(And(And(FreeQ(List($s("F"),a,b,c,d,e,f,g,h,i),x),ZeroQ(Plus(Sqr(f),Times(CN1,Sqr(g))))),ZeroQ(Plus(Sqr(h),Times(CN1,Sqr(i))))),ZeroQ(Plus(Times(g,h),Times(CN1,f,i)))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Plus(h_,Times(i_DEFAULT,Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(f_,Times(g_DEFAULT,Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(C2,i,Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Sin(Plus(d,Times(e,x))),Power(Plus(f,Times(g,Cos(Plus(d,Times(e,x))))),CN1)),x)),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Plus(h,Times(CN1,i,Sin(Plus(d,Times(e,x))))),Power(Plus(f,Times(g,Cos(Plus(d,Times(e,x))))),CN1)),x)),And(And(And(FreeQ(List($s("F"),a,b,c,d,e,f,g,h,i),x),ZeroQ(Plus(Sqr(f),Times(CN1,Sqr(g))))),ZeroQ(Plus(Sqr(h),Times(CN1,Sqr(i))))),ZeroQ(Plus(Times(g,h),Times(f,i)))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,u_)),Power($($p("G"),v_),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power($s("F"),Times(c,ExpandToSum(u,x))),Power(G(ExpandToSum(v,x)),n)),x),And(And(And(FreeQ(List($s("F"),c,n),x),TrigQ($s("G"))),LinearQ(List(u,v),x)),Not(LinearMatchQ(List(u,v),x))))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Sin(Plus(d,Times(e,x))),n)),x)))),Plus(Dist(Power(x,m),u,x),Times(CN1,m,Int(Times(Power(x,Plus(m,Times(CN1,C1))),u),x)))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),RationalQ(m)),Greater(m,C0)),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Cos(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Power(Cos(Plus(d,Times(e,x))),n)),x)))),Plus(Dist(Power(x,m),u,x),Times(CN1,m,Int(Times(Power(x,Plus(m,Times(CN1,C1))),u),x)))),And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),RationalQ(m)),Greater(m,C0)),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Cos(Plus(f_DEFAULT,Times(g_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Cos(Plus(f,Times(g,x))),n)),x),x),And(FreeQ(List($s("F"),a,b,c,d,e,f,g),x),PositiveIntegerQ(m,n)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(x_,p_DEFAULT),Power(Cos(Plus(f_DEFAULT,Times(g_DEFAULT,x_))),n_DEFAULT),Power(Sin(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Times(Power(x,p),Power($s("F"),Times(c,Plus(a,Times(b,x))))),Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Cos(Plus(f,Times(g,x))),n)),x),x),And(FreeQ(List($s("F"),a,b,c,d,e,f,g),x),PositiveIntegerQ(m,n,p)))),
ISetDelayed(Int(Times(Power($p("F"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power($($p("G"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power($($p("H"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power($s("F"),Times(c,Plus(a,Times(b,x)))),Times(Power(G(Plus(d,Times(e,x))),m),Power(H(Plus(d,Times(e,x))),n)),x),x),And(And(And(FreeQ(List($s("F"),a,b,c,d,e),x),PositiveIntegerQ(m,n)),TrigQ($s("G"))),TrigQ($s("H"))))),
ISetDelayed(Int(Times(Power($p("F"),u_),Power(Sin(v_),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power($s("F"),u),Power(Sin(v),n),x),x),And(And(And(FreeQ($s("F"),x),Or(LinearQ(u,x),QuadraticQ(u,x))),Or(LinearQ(v,x),QuadraticQ(v,x))),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),u_),Power(Cos(v_),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power($s("F"),u),Power(Cos(v),n),x),x),And(And(And(FreeQ($s("F"),x),Or(LinearQ(u,x),QuadraticQ(u,x))),Or(LinearQ(v,x),QuadraticQ(v,x))),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power($p("F"),u_),Power(Sin(v_),m_DEFAULT),Power(Cos(v_),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigToExp(Power($s("F"),u),Times(Power(Sin(v),m),Power(Cos(v),n)),x),x),And(And(And(FreeQ($s("F"),x),Or(LinearQ(u,x),QuadraticQ(u,x))),Or(LinearQ(v,x),QuadraticQ(v,x))),PositiveIntegerQ(m,n))))
  );
}
