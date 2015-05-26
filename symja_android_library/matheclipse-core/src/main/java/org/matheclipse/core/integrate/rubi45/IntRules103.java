package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules103 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(Sinh(Times(a_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1))),n_DEFAULT),x_Symbol),
    Condition(Times(CN1,Power(d,-1),Subst(Int(Times(Power(Sinh(Times(a,x)),n),Power(x,-2)),x),x,Power(Plus(c,Times(d,x)),-1))),And(FreeQ(List(a,c,d),x),PositiveIntegerQ(n)))),
ISetDelayed(Int(Power(Cosh(Times(a_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1))),n_DEFAULT),x_Symbol),
    Condition(Times(CN1,Power(d,-1),Subst(Int(Times(Power(Cosh(Times(a,x)),n),Power(x,-2)),x),x,Power(Plus(c,Times(d,x)),-1))),And(FreeQ(List(a,c,d),x),PositiveIntegerQ(n)))),
ISetDelayed(Int(Power(Sinh(Times(e_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1))),n_DEFAULT),x_Symbol),
    Condition(Times(CN1,Power(d,-1),Subst(Int(Times(Power(Sinh(Plus(Times(b,e,Power(d,-1)),Times(CN1,e,Plus(Times(b,c),Times(CN1,a,d)),x,Power(d,-1)))),n),Power(x,-2)),x),x,Power(Plus(c,Times(d,x)),-1))),And(And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(n)),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Power(Cosh(Times(e_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1))),n_DEFAULT),x_Symbol),
    Condition(Times(CN1,Power(d,-1),Subst(Int(Times(Power(Cosh(Plus(Times(b,e,Power(d,-1)),Times(CN1,e,Plus(Times(b,c),Times(CN1,a,d)),x,Power(d,-1)))),n),Power(x,-2)),x),x,Power(Plus(c,Times(d,x)),-1))),And(And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(n)),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Power(Sinh(u_),n_DEFAULT),x_Symbol),
    Condition(Module(List(Set($s("lst"),QuotientOfLinearsParts(u,x))),Int(Power(Sinh(Times(Plus(Part($s("lst"),C1),Times(Part($s("lst"),C2),x)),Power(Plus(Part($s("lst"),C3),Times(Part($s("lst"),C4),x)),-1))),n),x)),And(PositiveIntegerQ(n),QuotientOfLinearsQ(u,x)))),
ISetDelayed(Int(Power(Cosh(u_),n_DEFAULT),x_Symbol),
    Condition(Module(List(Set($s("lst"),QuotientOfLinearsParts(u,x))),Int(Power(Cosh(Times(Plus(Part($s("lst"),C1),Times(Part($s("lst"),C2),x)),Power(Plus(Part($s("lst"),C3),Times(Part($s("lst"),C4),x)),-1))),n),x)),And(PositiveIntegerQ(n),QuotientOfLinearsQ(u,x)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Sinh(v_),p_DEFAULT),Power(Sinh(w_),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(Sinh(v),Plus(p,q))),x),ZeroQ(Plus(v,Negate(w))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Cosh(v_),p_DEFAULT),Power(Cosh(w_),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(Cosh(v),Plus(p,q))),x),ZeroQ(Plus(v,Negate(w))))),
ISetDelayed(Int(Times(Power(Sinh(v_),p_DEFAULT),Power(Sinh(w_),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Times(Power(Sinh(v),p),Power(Sinh(w),q)),x),x),And(PositiveIntegerQ(p,q),Or(And(PolynomialQ(v,x),PolynomialQ(w,x)),And(BinomialQ(List(v,w),x),IndependentQ(Cancel(Times(v,Power(w,-1))),x)))))),
ISetDelayed(Int(Times(Power(Cosh(v_),p_DEFAULT),Power(Cosh(w_),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Times(Power(Cosh(v),p),Power(Cosh(w),q)),x),x),And(PositiveIntegerQ(p,q),Or(And(PolynomialQ(v,x),PolynomialQ(w,x)),And(BinomialQ(List(v,w),x),IndependentQ(Cancel(Times(v,Power(w,-1))),x)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(v_),p_DEFAULT),Power(Sinh(w_),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(x,m),Times(Power(Sinh(v),p),Power(Sinh(w),q)),x),x),And(PositiveIntegerQ(m,p,q),Or(And(PolynomialQ(v,x),PolynomialQ(w,x)),And(BinomialQ(List(v,w),x),IndependentQ(Cancel(Times(v,Power(w,-1))),x)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(v_),p_DEFAULT),Power(Cosh(w_),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(x,m),Times(Power(Cosh(v),p),Power(Cosh(w),q)),x),x),And(PositiveIntegerQ(m,p,q),Or(And(PolynomialQ(v,x),PolynomialQ(w,x)),And(BinomialQ(List(v,w),x),IndependentQ(Cancel(Times(v,Power(w,-1))),x)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Sinh(v_),p_DEFAULT),Power(Cosh(w_),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Power(C2,p),-1),Int(Times(u,Power(Sinh(Times(C2,v)),p)),x)),And(ZeroQ(Plus(v,Negate(w))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Cosh(w_),q_DEFAULT),Power(Sinh(v_),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Times(Power(Sinh(v),p),Power(Cosh(w),q)),x),x),And(PositiveIntegerQ(p,q),Or(And(PolynomialQ(v,x),PolynomialQ(w,x)),And(BinomialQ(List(v,w),x),IndependentQ(Cancel(Times(v,Power(w,-1))),x)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(v_),p_DEFAULT),Power(Cosh(w_),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(x,m),Times(Power(Sinh(v),p),Power(Cosh(w),q)),x),x),And(PositiveIntegerQ(m,p,q),Or(And(PolynomialQ(v,x),PolynomialQ(w,x)),And(BinomialQ(List(v,w),x),IndependentQ(Cancel(Times(v,Power(w,-1))),x)))))),
ISetDelayed(Int(Times(Power(Tanh(w_),n_DEFAULT),Sinh(v_)),x_Symbol),
    Condition(Plus(Int(Times(Cosh(v),Power(Tanh(w),Plus(n,Negate(C1)))),x),Times(CN1,Cosh(Plus(v,Negate(w))),Int(Times(Sech(w),Power(Tanh(w),Plus(n,Negate(C1)))),x))),And(And(And(RationalQ(n),Greater(n,C0)),FreeQ(Plus(v,Negate(w)),x)),NonzeroQ(Plus(v,Negate(w)))))),
ISetDelayed(Int(Times(Cosh(v_),Power(Coth(w_),n_DEFAULT)),x_Symbol),
    Condition(Plus(Int(Times(Sinh(v),Power(Coth(w),Plus(n,Negate(C1)))),x),Times(Cosh(Plus(v,Negate(w))),Int(Times(Csch(w),Power(Coth(w),Plus(n,Negate(C1)))),x))),And(And(And(RationalQ(n),Greater(n,C0)),FreeQ(Plus(v,Negate(w)),x)),NonzeroQ(Plus(v,Negate(w)))))),
ISetDelayed(Int(Times(Power(Coth(w_),n_DEFAULT),Sinh(v_)),x_Symbol),
    Condition(Plus(Int(Times(Cosh(v),Power(Coth(w),Plus(n,Negate(C1)))),x),Times(Sinh(Plus(v,Negate(w))),Int(Times(Csch(w),Power(Coth(w),Plus(n,Negate(C1)))),x))),And(And(And(RationalQ(n),Greater(n,C0)),FreeQ(Plus(v,Negate(w)),x)),NonzeroQ(Plus(v,Negate(w)))))),
ISetDelayed(Int(Times(Cosh(v_),Power(Tanh(w_),n_DEFAULT)),x_Symbol),
    Condition(Plus(Int(Times(Sinh(v),Power(Tanh(w),Plus(n,Negate(C1)))),x),Times(CN1,Sinh(Plus(v,Negate(w))),Int(Times(Sech(w),Power(Tanh(w),Plus(n,Negate(C1)))),x))),And(And(And(RationalQ(n),Greater(n,C0)),FreeQ(Plus(v,Negate(w)),x)),NonzeroQ(Plus(v,Negate(w)))))),
ISetDelayed(Int(Times(Power(Sech(w_),n_DEFAULT),Sinh(v_)),x_Symbol),
    Condition(Plus(Times(Cosh(Plus(v,Negate(w))),Int(Times(Tanh(w),Power(Sech(w),Plus(n,Negate(C1)))),x)),Times(Sinh(Plus(v,Negate(w))),Int(Power(Sech(w),Plus(n,Negate(C1))),x))),And(And(And(RationalQ(n),Greater(n,C0)),FreeQ(Plus(v,Negate(w)),x)),NonzeroQ(Plus(v,Negate(w)))))),
ISetDelayed(Int(Times(Cosh(v_),Power(Csch(w_),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Cosh(Plus(v,Negate(w))),Int(Times(Coth(w),Power(Csch(w),Plus(n,Negate(C1)))),x)),Times(Sinh(Plus(v,Negate(w))),Int(Power(Csch(w),Plus(n,Negate(C1))),x))),And(And(And(RationalQ(n),Greater(n,C0)),FreeQ(Plus(v,Negate(w)),x)),NonzeroQ(Plus(v,Negate(w)))))),
ISetDelayed(Int(Times(Power(Csch(w_),n_DEFAULT),Sinh(v_)),x_Symbol),
    Condition(Plus(Times(Sinh(Plus(v,Negate(w))),Int(Times(Coth(w),Power(Csch(w),Plus(n,Negate(C1)))),x)),Times(Cosh(Plus(v,Negate(w))),Int(Power(Csch(w),Plus(n,Negate(C1))),x))),And(And(And(RationalQ(n),Greater(n,C0)),FreeQ(Plus(v,Negate(w)),x)),NonzeroQ(Plus(v,Negate(w)))))),
ISetDelayed(Int(Times(Cosh(v_),Power(Sech(w_),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Sinh(Plus(v,Negate(w))),Int(Times(Tanh(w),Power(Sech(w),Plus(n,Negate(C1)))),x)),Times(Cosh(Plus(v,Negate(w))),Int(Power(Sech(w),Plus(n,Negate(C1))),x))),And(And(And(RationalQ(n),Greater(n,C0)),FreeQ(Plus(v,Negate(w)),x)),NonzeroQ(Plus(v,Negate(w)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_)),n_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,-1),Subst(Int(Times(Power(Plus(Times(CN1,c,Power(d,-1)),Times(x,Power(d,-1))),m),Power(Sinh(Plus(a,Times(b,Power(x,n)))),p)),x),x,Plus(c,Times(d,x)))),And(And(FreeQ(List(a,b,c,d,n),x),PositiveIntegerQ(m)),RationalQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_)),n_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,-1),Subst(Int(Times(Power(Plus(Times(CN1,c,Power(d,-1)),Times(x,Power(d,-1))),m),Power(Cosh(Plus(a,Times(b,Power(x,n)))),p)),x),x,Plus(c,Times(d,x)))),And(And(FreeQ(List(a,b,c,d,n),x),PositiveIntegerQ(m)),RationalQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Cosh(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Times(c_DEFAULT,Sqr(Sinh(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Times(C2,Int(Times(Power(x,m),Power(Plus(Times(C2,a),b,Negate(c),Times(Plus(b,c),Cosh(Plus(Times(C2,d),Times(C2,e,x))))),-1)),x)),And(And(And(FreeQ(List(a,b,c,d,e),x),PositiveIntegerQ(m)),NonzeroQ(Plus(a,b))),NonzeroQ(Plus(a,c))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(b_,Times(c_DEFAULT,Sqr(Tanh(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),-1),Sqr(Sech(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),x_Symbol),
    Condition(Times(C2,Int(Times(Power(x,m),Power(Plus(b,Negate(c),Times(Plus(b,c),Cosh(Plus(Times(C2,d),Times(C2,e,x))))),-1)),x)),And(FreeQ(List(b,c,d,e),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(b_DEFAULT,Times(a_DEFAULT,Sqr(Sech(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Times(c_DEFAULT,Sqr(Tanh(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),-1),Sqr(Sech(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),x_Symbol),
    Condition(Times(C2,Int(Times(Power(x,m),Power(Plus(Times(C2,a),b,Negate(c),Times(Plus(b,c),Cosh(Plus(Times(C2,d),Times(C2,e,x))))),-1)),x)),And(And(And(FreeQ(List(a,b,c,d,e),x),PositiveIntegerQ(m)),NonzeroQ(Plus(a,b))),NonzeroQ(Plus(a,c))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Sqr(Csch(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Power(Plus(c_,Times(b_DEFAULT,Sqr(Coth(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Times(C2,Int(Times(Power(x,m),Power(Plus(b,Negate(c),Times(Plus(b,c),Cosh(Plus(Times(C2,d),Times(C2,e,x))))),-1)),x)),And(FreeQ(List(b,c,d,e),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Sqr(Csch(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(b_DEFAULT,Sqr(Coth(Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Times(a_DEFAULT,Sqr(Csch(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Times(C2,Int(Times(Power(x,m),Power(Plus(Times(C2,a),b,Negate(c),Times(Plus(b,c),Cosh(Plus(Times(C2,d),Times(C2,e,x))))),-1)),x)),And(And(And(FreeQ(List(a,b,c,d,e),x),PositiveIntegerQ(m)),NonzeroQ(Plus(a,b))),NonzeroQ(Plus(a,c))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(m,C1)),Power(Times(b,Plus(m,C1)),-1)),Int(Times(Power(x,m),Power(E,Plus(c,Times(d,x))),Power(Plus(a,Sqrt(Plus(Sqr(a),Sqr(b))),Times(b,Power(E,Plus(c,Times(d,x))))),-1)),x),Int(Times(Power(x,m),Power(E,Plus(c,Times(d,x))),Power(Plus(a,Negate(Sqrt(Plus(Sqr(a),Sqr(b)))),Times(b,Power(E,Plus(c,Times(d,x))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(m,C1)),Power(Times(b,Plus(m,C1)),-1)),Int(Times(Power(x,m),Power(E,Plus(c,Times(d,x))),Power(Plus(a,Sqrt(Plus(Sqr(a),Negate(Sqr(b)))),Times(b,Power(E,Plus(c,Times(d,x))))),-1)),x),Int(Times(Power(x,m),Power(E,Plus(c,Times(d,x))),Power(Plus(a,Negate(Sqrt(Plus(Sqr(a),Negate(Sqr(b))))),Times(b,Power(E,Plus(c,Times(d,x))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(CN1,a,Power(b,-2),Int(Times(Power(x,m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C2)))),x)),Times(Power(b,-1),Int(Times(Power(x,m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Sinh(Plus(c,Times(d,x)))),x)),Times(Plus(Sqr(a),Sqr(b)),Power(b,-2),Int(Times(Power(x,m),Power(Cosh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m)),IntegerQ(n)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-1),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,a,Power(b,-2),Int(Times(Power(x,m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C2)))),x)),Times(Power(b,-1),Int(Times(Power(x,m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Cosh(Plus(c,Times(d,x)))),x)),Times(Plus(Sqr(a),Negate(Sqr(b))),Power(b,-2),Int(Times(Power(x,m),Power(Sinh(Plus(c,Times(d,x))),Plus(n,Negate(C2))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m)),IntegerQ(n)),Greater(n,C1)))),
ISetDelayed(Int(Times(x_,Plus(A_,Times(B_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-2)),x_Symbol),
    Condition(Plus(Times(BSymbol,x,Cosh(Plus(c,Times(d,x))),Power(Times(a,d,Plus(a,Times(b,Sinh(Plus(c,Times(d,x)))))),-1)),Times(CN1,BSymbol,Power(Times(a,d),-1),Int(Times(Cosh(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),-1)),x))),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol),x),ZeroQ(Plus(Times(a,ASymbol),Times(b,BSymbol)))))),
ISetDelayed(Int(Times(x_,Plus(A_,Times(B_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),-2)),x_Symbol),
    Condition(Plus(Times(BSymbol,x,Sinh(Plus(c,Times(d,x))),Power(Times(a,d,Plus(a,Times(b,Cosh(Plus(c,Times(d,x)))))),-1)),Times(CN1,BSymbol,Power(Times(a,d),-1),Int(Times(Sinh(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),-1)),x))),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol),x),ZeroQ(Plus(Times(a,ASymbol),Times(CN1,b,BSymbol)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,Tanh(v_))),n_DEFAULT),Power(Sech(v_),m_DEFAULT)),x_Symbol),
    Condition(Int(Power(Plus(Times(a,Cosh(v)),Times(b,Sinh(v))),n),x),And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),Equal(Plus(m,n),C0)),OddQ(m)))),
ISetDelayed(Int(Times(Power(Csch(v_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Coth(v_))),n_DEFAULT)),x_Symbol),
    Condition(Int(Power(Plus(Times(b,Cosh(v)),Times(a,Sinh(v))),n),x),And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),Equal(Plus(m,n),C0)),OddQ(m)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(u,Times(Power(Sinh(Plus(a,Times(b,x))),m),Power(Sinh(Plus(c,Times(d,x))),n)),x),x),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m,n)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_DEFAULT),Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(u,Times(Power(Cosh(Plus(a,Times(b,x))),m),Power(Cosh(Plus(c,Times(d,x))),n)),x),x),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m,n)))),
ISetDelayed(Int(Times(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Sech(Plus(c_,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,Csch(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Tanh(Plus(a,Times(b,x))),x)),Times(Csch(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1))),Int(Tanh(Plus(c,Times(d,x))),x))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(b),Negate(Sqr(d))))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Csch(Plus(c_,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(Csch(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1))),Int(Coth(Plus(a,Times(b,x))),x)),Times(CN1,Csch(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Coth(Plus(c,Times(d,x))),x))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(b),Negate(Sqr(d))))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Tanh(Plus(c_,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(b,x,Power(d,-1)),Times(CN1,b,Power(d,-1),Cosh(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Sech(Plus(a,Times(b,x))),Sech(Plus(c,Times(d,x)))),x))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(b),Negate(Sqr(d))))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Coth(Plus(c_,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(b,x,Power(d,-1)),Times(Cosh(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Csch(Plus(a,Times(b,x))),Csch(Plus(c,Times(d,x)))),x))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(b),Negate(Sqr(d))))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(x,ArcTan(Plus(c,Times(d,Tanh(Plus(a,Times(b,x))))))),Times(CN1,b,Int(Times(x,Power(Plus(c,Negate(d),Times(c,Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))))),
ISetDelayed(Int(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(x,ArcCot(Plus(c,Times(d,Tanh(Plus(a,Times(b,x))))))),Times(b,Int(Times(x,Power(Plus(c,Negate(d),Times(c,Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))))),
ISetDelayed(Int(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(x,ArcTan(Plus(c,Times(d,Tanh(Plus(a,Times(b,x))))))),Times(CN1,CI,b,Plus(Negate(CI),c,Negate(d)),Int(Times(x,Power(Plus(Negate(CI),c,Negate(d),Times(Plus(Negate(CI),c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x)),Times(CI,b,Plus(CI,c,Negate(d)),Int(Times(x,Power(Plus(CI,c,Negate(d),Times(Plus(CI,c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))))),
ISetDelayed(Int(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(x,ArcCot(Plus(c,Times(d,Tanh(Plus(a,Times(b,x))))))),Times(CI,b,Plus(Negate(CI),c,Negate(d)),Int(Times(x,Power(Plus(Negate(CI),c,Negate(d),Times(Plus(Negate(CI),c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x)),Times(CN1,CI,b,Plus(CI,c,Negate(d)),Int(Times(x,Power(Plus(CI,c,Negate(d),Times(Plus(CI,c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))))),
ISetDelayed(Int(Times(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTan(Plus(c,Times(d,Tanh(Plus(a,Times(b,x)))))),Power(Plus(m,C1),-1)),Times(CN1,b,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Negate(d),Times(c,Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCot(Plus(c,Times(d,Tanh(Plus(a,Times(b,x)))))),Power(Plus(m,C1),-1)),Times(b,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Negate(d),Times(c,Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTan(Plus(c,Times(d,Tanh(Plus(a,Times(b,x)))))),Power(Plus(m,C1),-1)),Times(CN1,CI,b,Plus(Negate(CI),c,Negate(d)),Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(Negate(CI),c,Negate(d),Times(Plus(Negate(CI),c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x)),Times(CI,b,Plus(CI,c,Negate(d)),Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(CI,c,Negate(d),Times(Plus(CI,c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCot(Plus(c,Times(d,Tanh(Plus(a,Times(b,x)))))),Power(Plus(m,C1),-1)),Times(CI,b,Plus(Negate(CI),c,Negate(d)),Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(Negate(CI),c,Negate(d),Times(Plus(Negate(CI),c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x)),Times(CN1,CI,b,Plus(CI,c,Negate(d)),Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(CI,c,Negate(d),Times(Plus(CI,c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(x,ArcTan(Plus(c,Times(d,Coth(Plus(a,Times(b,x))))))),Times(CN1,b,Int(Times(x,Power(Plus(c,Negate(d),Times(CN1,c,Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))))),
ISetDelayed(Int(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(x,ArcCot(Plus(c,Times(d,Coth(Plus(a,Times(b,x))))))),Times(b,Int(Times(x,Power(Plus(c,Negate(d),Times(CN1,c,Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))))),
ISetDelayed(Int(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(x,ArcTan(Plus(c,Times(d,Coth(Plus(a,Times(b,x))))))),Times(CN1,CI,b,Plus(Negate(CI),c,Negate(d)),Int(Times(x,Power(Plus(Negate(CI),c,Negate(d),Times(CN1,Plus(Negate(CI),c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x)),Times(CI,b,Plus(CI,c,Negate(d)),Int(Times(x,Power(Plus(CI,c,Negate(d),Times(CN1,Plus(CI,c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))))),
ISetDelayed(Int(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(x,ArcCot(Plus(c,Times(d,Coth(Plus(a,Times(b,x))))))),Times(CI,b,Plus(Negate(CI),c,Negate(d)),Int(Times(x,Power(Plus(Negate(CI),c,Negate(d),Times(CN1,Plus(Negate(CI),c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x)),Times(CN1,CI,b,Plus(CI,c,Negate(d)),Int(Times(x,Power(Plus(CI,c,Negate(d),Times(CN1,Plus(CI,c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))))),
ISetDelayed(Int(Times(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTan(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Plus(m,C1),-1)),Times(CN1,b,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Negate(d),Times(CN1,c,Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCot(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Plus(m,C1),-1)),Times(b,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(c,Negate(d),Times(CN1,c,Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(ArcTan(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTan(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Plus(m,C1),-1)),Times(CN1,CI,b,Plus(Negate(CI),c,Negate(d)),Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(Negate(CI),c,Negate(d),Times(CN1,Plus(Negate(CI),c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x)),Times(CI,b,Plus(CI,c,Negate(d)),Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(CI,c,Negate(d),Times(CN1,Plus(CI,c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(ArcCot(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCot(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Plus(m,C1),-1)),Times(CI,b,Plus(Negate(CI),c,Negate(d)),Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(Negate(CI),c,Negate(d),Times(CN1,Plus(Negate(CI),c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x)),Times(CN1,CI,b,Plus(CI,c,Negate(d)),Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(CI,c,Negate(d),Times(CN1,Plus(CI,c,d),Power(E,Plus(Times(C2,a),Times(C2,b,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(Plus(c,Negate(d))),C1))),RationalQ(m)),Greater(m,C0))))
  );
}