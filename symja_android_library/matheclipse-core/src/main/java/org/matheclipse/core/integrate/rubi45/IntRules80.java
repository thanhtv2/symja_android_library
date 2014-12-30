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
public class IntRules80 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),x_Symbol),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Power(Plus(b,Times(C2,c,Power(Sec(Plus(d,Times(e,x))),n))),Times(C2,p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(p)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),x_Symbol),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Power(Plus(b,Times(C2,c,Power(Csc(Plus(d,Times(e,x))),n))),Times(C2,p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(p)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(Sec(Plus(d,Times(e,x))),n)),Times(c,Power(Sec(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sec(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(u,Power(Plus(b,Times(C2,c,Power(Sec(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(Csc(Plus(d,Times(e,x))),n)),Times(c,Power(Csc(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Csc(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(u,Power(Plus(b,Times(C2,c,Power(Csc(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),CN1),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(q,CN1),Int(Power(Plus(b,Times(CN1,q),Times(C2,c,Power(Sec(Plus(d,Times(e,x))),n))),CN1),x)),Times(CN1,C2,c,Power(q,CN1),Int(Power(Plus(b,q,Times(C2,c,Power(Sec(Plus(d,Times(e,x))),n))),CN1),x)))),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),CN1),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(q,CN1),Int(Power(Plus(b,Times(CN1,q),Times(C2,c,Power(Csc(Plus(d,Times(e,x))),n))),CN1),x)),Times(CN1,C2,c,Power(q,CN1),Int(Power(Plus(b,q,Times(C2,c,Power(Csc(Plus(d,Times(e,x))),n))),CN1),x)))),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")))),p_DEFAULT),Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Times(CN1,f,Power(e,CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(f),Sqr(x))),Times(C1D2,Plus(m,Times(CN1,C1)))),Power(Plus(b,Times(a,Power(Times(f,x),n))),p),Power(Power(Times(f,x),Times(n,p)),CN1)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),OddQ(m)),IntegersQ(n,p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")))),p_DEFAULT),Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Times(f,Power(e,CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(f),Sqr(x))),Times(C1D2,Plus(m,Times(CN1,C1)))),Power(Plus(b,Times(a,Power(Times(f,x),n))),p),Power(Power(Times(f,x),Times(n,p)),CN1)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),OddQ(m)),IntegersQ(n,p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")))),p_DEFAULT),Power($($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Times(Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(a,Times(b,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,n))),Times(c,Power(Plus(C1,Times(Sqr(f),Sqr(x))),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),C1)),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),EvenQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),Times(c_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")))),p_DEFAULT),Power($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Times(CN1,Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(a,Times(b,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,n))),Times(c,Power(Plus(C1,Times(Sqr(f),Sqr(x))),n))),x),p),Power(Power(Plus(C1,Times(Sqr(f),Sqr(x))),Plus(Times(C1D2,m),C1)),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),EvenQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Sec(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sec(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Csc(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Csc(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(Sec(Plus(d,Times(e,x))),n)),Times(c,Power(Sec(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sec(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Sec(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sec(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(Csc(Plus(d,Times(e,x))),n)),Times(c,Power(Csc(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Csc(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Csc(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Csc(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power($($s("§sec"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§sec"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§sec"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),IntegersQ(m,n,p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_),Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power($($s("§csc"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§csc"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§csc"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),IntegersQ(m,n,p)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Times(CN1,Power(Times(e,Power(f,Plus(m,Times(n,p),Times(CN1,C1)))),CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(f),Sqr(x))),Times(C1D2,Plus(m,Times(CN1,C1)))),Power(Plus(c,Times(b,Power(Times(f,x),n)),Times(c,Power(Times(f,x),Times(C2,n)))),p),Power(Power(x,Plus(m,Times(C2,n,p))),CN1)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),OddQ(m)),IntegerQ(n)),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Times(Power(Times(e,Power(f,Plus(m,Times(n,p),Times(CN1,C1)))),CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(f),Sqr(x))),Times(C1D2,Plus(m,Times(CN1,C1)))),Power(Plus(c,Times(b,Power(Times(f,x),n)),Times(c,Power(Times(f,x),Times(C2,n)))),p),Power(Power(x,Plus(m,Times(C2,n,p))),CN1)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),OddQ(m)),IntegerQ(n)),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Times(Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(a,Times(b,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,n))),Times(c,Power(Plus(C1,Times(Sqr(f),Sqr(x))),n))),x),p),Power(Plus(C1,Times(Sqr(f),Sqr(x))),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),EvenQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),Times(c_DEFAULT,Power($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT),Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Times(CN1,Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(a,Times(b,Power(Plus(C1,Times(Sqr(f),Sqr(x))),Times(C1D2,n))),Times(c,Power(Plus(C1,Times(Sqr(f),Sqr(x))),n))),x),p),Power(Plus(C1,Times(Sqr(f),Sqr(x))),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),EvenQ(n)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Times(Power(Times(Power(C4,n),Power(c,n)),CN1),Int(Times(Plus($s("A"),Times($s("B"),Sec(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Sec(Plus(d,Times(e,x))))),Times(C2,n))),x)),And(And(FreeQ(List(a,b,c,d,e,$s("A"),$s("B")),x),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(n)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Times(Power(Times(Power(C4,n),Power(c,n)),CN1),Int(Times(Plus($s("A"),Times($s("B"),Csc(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Csc(Plus(d,Times(e,x))))),Times(C2,n))),x)),And(And(FreeQ(List(a,b,c,d,e,$s("A"),$s("B")),x),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(n)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Sec(Plus(d,Times(e,x)))),Times(c,Sqr(Sec(Plus(d,Times(e,x)))))),n),Power(Power(Plus(b,Times(C2,c,Sec(Plus(d,Times(e,x))))),Times(C2,n)),CN1),Int(Times(Plus($s("A"),Times($s("B"),Sec(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Sec(Plus(d,Times(e,x))))),Times(C2,n))),x)),And(And(FreeQ(List(a,b,c,d,e,$s("A"),$s("B")),x),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Csc(Plus(d,Times(e,x)))),Times(c,Sqr(Csc(Plus(d,Times(e,x)))))),n),Power(Power(Plus(b,Times(C2,c,Csc(Plus(d,Times(e,x))))),Times(C2,n)),CN1),Int(Times(Plus($s("A"),Times($s("B"),Csc(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Csc(Plus(d,Times(e,x))))),Times(C2,n))),x)),And(And(FreeQ(List(a,b,c,d,e,$s("A"),$s("B")),x),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Times(Plus($s("B"),Times(Plus(Times(b,$s("B")),Times(CN1,C2,$s("A"),c)),Power(q,CN1))),Int(Power(Plus(b,q,Times(C2,c,Sec(Plus(d,Times(e,x))))),CN1),x)),Times(Plus($s("B"),Times(CN1,Plus(Times(b,$s("B")),Times(CN1,C2,$s("A"),c)),Power(q,CN1))),Int(Power(Plus(b,Times(CN1,q),Times(C2,c,Sec(Plus(d,Times(e,x))))),CN1),x)))),And(FreeQ(List(a,b,c,d,e,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Times(Plus($s("B"),Times(Plus(Times(b,$s("B")),Times(CN1,C2,$s("A"),c)),Power(q,CN1))),Int(Power(Plus(b,q,Times(C2,c,Csc(Plus(d,Times(e,x))))),CN1),x)),Times(Plus($s("B"),Times(CN1,Plus(Times(b,$s("B")),Times(CN1,C2,$s("A"),c)),Power(q,CN1))),Int(Power(Plus(b,Times(CN1,q),Times(C2,c,Csc(Plus(d,Times(e,x))))),CN1),x)))),And(FreeQ(List(a,b,c,d,e,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§sec"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Plus($s("A"),Times($s("B"),$($s("§sec"),Plus(d,Times(e,x))))),Power(Plus(a,Times(b,$($s("§sec"),Plus(d,Times(e,x)))),Times(c,Sqr($($s("§sec"),Plus(d,Times(e,x)))))),n)),x),x),And(And(FreeQ(List(a,b,c,d,e,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(n)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§csc"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Plus($s("A"),Times($s("B"),$($s("§csc"),Plus(d,Times(e,x))))),Power(Plus(a,Times(b,$($s("§csc"),Plus(d,Times(e,x)))),Times(c,Sqr($($s("§csc"),Plus(d,Times(e,x)))))),n)),x),x),And(And(FreeQ(List(a,b,c,d,e,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(n))))
  );
}
