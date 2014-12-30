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
public class IntRules6 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(Plus(Times(a,x,Power(c,CN1)),Times(Plus(Times(b,c),Times(CN1,a,d)),Power(c,CN1),Int(Power(Plus(d,Times(c,Power(x,Times(CN1,n)))),CN1),x))),And(And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(n)),Less(n,C0)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(Plus(Times(b,x,Power(d,CN1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(d,CN1),Int(Power(Plus(c,Times(d,Power(x,n))),CN1),x))),And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),Not(And(RationalQ(n),Less(n,C0)))))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Times(a,x,Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),Power(c,CN1)),And(And(And(FreeQ(List(a,b,c,d,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(b,c),Times(CN1,a,d,Plus(Times(n,Plus(p,C1)),C1))))),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Plus(a,Times(b,Power(x,n))),Power(Plus(c,Times(d,Power(x,n))),p)),x),x),And(And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d,Plus(Times(n,Plus(p,C1)),C1))))),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(b,c),Times(CN1,a,d)),x,Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),Power(Times(c,d,n,Plus(p,C1)),CN1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,d,Plus(Times(n,Plus(p,C1)),C1))),Power(Times(c,d,n,Plus(p,C1)),CN1),Int(Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d,Plus(Times(n,Plus(p,C1)),C1))))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Times(b,x,Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),Power(Times(d,Plus(Times(n,Plus(p,C1)),C1)),CN1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,d,Plus(Times(n,Plus(p,C1)),C1))),Power(Times(d,Plus(Times(n,Plus(p,C1)),C1)),CN1),Int(Power(Plus(c,Times(d,Power(x,n))),p),x))),And(And(And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d,Plus(Times(n,Plus(p,C1)),C1))))),Not(PositiveIntegerQ(p))),Not(And(RationalQ(p),Less(p,CN1)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),Plus(c_,Times(d_DEFAULT,Power(x_,n_)))),CN1),x_Symbol),
    Condition(Plus(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),CN1),Int(Power(Plus(a,Times(b,Power(x,n))),CN1),x)),Times(CN1,d,Power(Plus(Times(b,c),Times(CN1,a,d)),CN1),Int(Power(Plus(c,Times(d,Power(x,n))),CN1),x))),And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(Plus(Times(b,Power(d,CN1),Int(Power(Plus(a,Times(b,Power(x,n))),CN1D2),x)),Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(d,CN1),Int(Power(Times(Sqrt(Plus(a,Times(b,Power(x,n)))),Plus(c,Times(d,Power(x,n)))),CN1),x))),And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Sqr(x_))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))),CN1),x_Symbol),
    Condition(Subst(Int(Power(Simp(Plus(a,Times(Plus(Times(b,c),Times(CN1,a,d)),Sqr(x))),x),CN1),x),x,Times(x,Power(Plus(c,Times(d,Sqr(x))),CN1D2))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))),CN1),x_Symbol),
    Condition(Times(Power(Times(Sqrt(a),Sqrt(c),Rt(Times(CN1,d,Power(c,CN1)),C2)),CN1),EllipticF(ArcSin(Times(Rt(Times(CN1,d,Power(c,CN1)),C2),x)),Times(b,c,Power(Times(a,d),CN1)))),And(And(And(FreeQ(List(a,b,c,d),x),PositiveQ(a)),PositiveQ(c)),Not(SimplerSqrtQ(Times(CN1,b,Power(a,CN1)),Times(CN1,d,Power(c,CN1))))))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))),CN1),x_Symbol),
    Condition(Times(Sqrt(Times(Plus(a,Times(b,Sqr(x))),Power(a,CN1))),Sqrt(Times(Plus(c,Times(d,Sqr(x))),Power(c,CN1))),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x))))),CN1),Int(Power(Times(Sqrt(Plus(C1,Times(b,Power(a,CN1),Sqr(x)))),Sqrt(Plus(C1,Times(d,Power(c,CN1),Sqr(x))))),CN1),x)),And(FreeQ(List(a,b,c,d),x),Not(And(PositiveQ(a),PositiveQ(c)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(a),Power(Times(Sqrt(c),Rt(Times(CN1,d,Power(c,CN1)),C2)),CN1),EllipticE(ArcSin(Times(Rt(Times(CN1,d,Power(c,CN1)),C2),x)),Times(b,c,Power(Times(a,d),CN1)))),And(And(FreeQ(List(a,b,c,d),x),PositiveQ(a)),PositiveQ(c)))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Times(Plus(c,Times(d,Sqr(x))),Power(c,CN1))),Power(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Times(Plus(a,Times(b,Sqr(x))),Power(a,CN1)))),CN1),Int(Times(Sqrt(Plus(C1,Times(b,Power(a,CN1),Sqr(x)))),Power(Plus(C1,Times(d,Power(c,CN1),Sqr(x))),CN1D2)),x)),And(FreeQ(List(a,b,c,d),x),Not(And(PositiveQ(a),PositiveQ(c)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Times(x,Sqrt(Plus(a,Times(b,Sqr(x)))),C1D3,Sqrt(Plus(c,Times(d,Sqr(x))))),Times(C1D3,Int(Times(Plus(Times(C2,a,c),Times(Plus(Times(b,c),Times(a,d)),Sqr(x))),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(d,Sqr(x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),Sqrt(Plus(c_,Times(d_DEFAULT,Power(x_,C4))))),CN1),x_Symbol),
    Condition(Plus(Times(Power(Times(C2,a),CN1),Int(Power(Times(Plus(C1,Times(CN1,Rt(Times(CN1,b,Power(a,CN1)),C2),Sqr(x))),Sqrt(Plus(c,Times(d,Power(x,C4))))),CN1),x)),Times(Power(Times(C2,a),CN1),Int(Power(Times(Plus(C1,Times(Rt(Times(CN1,b,Power(a,CN1)),C2),Sqr(x))),Sqrt(Plus(c,Times(d,Power(x,C4))))),CN1),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Power(Times(Plus(c_,Times(d_DEFAULT,Power(x_,C4))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),C1D4)),CN1),x_Symbol),
    Condition(Subst(Int(Power(Plus(c,Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(x,C4))),CN1),x),x,Times(x,Power(Plus(a,Times(b,Power(x,C4))),CN1D4))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(PolynomialDivide(Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),Times(CN1,p)),x),x),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),PositiveIntegerQ(n,m,Times(CN1,p))),GreaterEqual(m,Times(CN1,p))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,d),Times(CN1,c,b)),x,Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(p,Times(CN1,C1))),Power(Times(a,b,n,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,b,n,Plus(m,C1)),CN1),Int(Times(Simp(Plus(Times(c,Plus(Times(a,d),Times(CN1,c,b,Plus(Times(n,Plus(m,C1)),C1)))),Times(d,Plus(Times(a,d,Plus(Times(n,Plus(p,Times(CN1,C1))),C1)),Times(CN1,b,c,Plus(Times(n,Plus(m,p)),C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(p,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,p)),Less(m,CN1)),Greater(p,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,x,Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),p),Power(Times(a,n,Plus(m,C1)),CN1)),Times(Power(Times(a,n,Plus(m,C1)),CN1),Int(Times(Simp(Plus(Times(c,Plus(Times(n,Plus(m,C1)),C1)),Times(d,Plus(Times(n,Plus(m,p,C1)),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,p)),Less(m,CN1)),And(Less(C0,p),LessEqual(p,C1))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Times(CN1,b,x,Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),Power(Times(a,n,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d))),CN1)),And(And(And(And(And(FreeQ(List(a,b,c,d,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m)),Less(m,CN1)),ZeroQ(Plus(Times(n,Plus(m,p,C2)),C1))),ZeroQ(Plus(Times(b,c),Times(n,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d)))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,b,x,Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),Power(Times(a,n,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d))),CN1)),Times(Plus(Times(b,c),Times(n,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d)))),Power(Times(a,n,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d))),CN1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),p)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m)),Less(m,CN1)),ZeroQ(Plus(Times(n,Plus(m,p,C2)),C1))),NonzeroQ(Plus(Times(b,c),Times(n,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d)))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,b,x,Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),Power(Times(a,n,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d))),CN1)),Times(Power(Times(a,n,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d))),CN1),Int(Times(Simp(Plus(Times(b,c),Times(n,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d))),Times(d,b,Plus(Times(n,Plus(m,p,C2)),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),p)),x))),And(And(And(And(FreeQ(List(a,b,c,d,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Times(n,Plus(m,p,C2)),C1))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),p)),x),x),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),PositiveIntegerQ(n)),IntegersQ(m,p)),Greater(Plus(m,p),C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(d,x,Power(Plus(a,Times(b,Power(x,n))),Plus(m,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(p,Times(CN1,C1))),Power(Times(b,Plus(Times(n,Plus(m,p)),C1)),CN1)),Times(Power(Times(b,Plus(Times(n,Plus(m,p)),C1)),CN1),Int(Times(Simp(Plus(Times(c,Plus(Times(b,c,Plus(Times(n,Plus(m,p)),C1)),Times(CN1,a,d))),Times(d,Plus(Times(b,c,Plus(Times(n,Plus(m,Times(C2,p),Times(CN1,C1))),C1)),Times(CN1,a,d,Plus(Times(n,Plus(p,Times(CN1,C1))),C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),Plus(p,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(p)),Greater(p,C1)),NonzeroQ(Plus(Times(n,Plus(m,p)),C1))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Times(x,Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),p),Power(Times(Power(Plus(C1,Times(b,Power(x,n),Power(a,CN1))),m),Power(Plus(C1,Times(d,Power(x,n),Power(c,CN1))),p)),CN1),AppellF1(Power(n,CN1),Times(CN1,m),Times(CN1,p),Plus(C1,Power(n,CN1)),Times(CN1,b,Power(x,n),Power(a,CN1)),Times(CN1,d,Power(x,n),Power(c,CN1)))),And(And(FreeQ(List(a,b,c,d,m,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(n,C1))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(v_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),p)),x),x,u)),And(And(And(FreeQ(List(a,b,c,d,m,n,p),x),ZeroQ(Plus(u,Times(CN1,v)))),LinearQ(u,x)),NonzeroQ(Plus(u,Times(CN1,x)))))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(v_,p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(ExpandToSum(v,x),p)),x),And(And(And(FreeQ(List(m,p),x),BinomialQ(List(u,v),x)),ZeroQ(Plus(BinomialDegree(u,x),Times(CN1,BinomialDegree(v,x))))),Not(BinomialMatchQ(List(u,v),x)))))
  );
}
