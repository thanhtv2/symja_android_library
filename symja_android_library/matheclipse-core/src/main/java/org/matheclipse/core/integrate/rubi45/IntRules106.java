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
public class IntRules106 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(Sqrt(d),Times(CN1,Sqrt(Times(CN1,e)),x)),p),Power(Plus(Sqrt(d),Times(Sqrt(Times(CN1,e)),x)),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(And(FreeQ(List(a,b,c,d,e,n),x),NegativeIntegerQ(p)),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(Sqrt(d),Times(CN1,Sqrt(Times(CN1,e)),x)),p),Power(Plus(Sqrt(d),Times(Sqrt(Times(CN1,e)),x)),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(And(FreeQ(List(a,b,c,d,e,n),x),NegativeIntegerQ(p)),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,n,p),x))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,n,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(Times(d,f),Times(e,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(d,g)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(Times(d,f),Times(e,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(d,g)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x))),Power(Plus(Times(d,f),Times(e,g,Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(Times(d,f),Times(e,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x)),And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(d,g)))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x))),Power(Plus(Times(d,f),Times(e,g,Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(Times(d,f),Times(e,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x)),And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(d,g)))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(Times(d,f),Times(e,g,Sqr(x)))),Power(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x)))),CN1),Int(Times(Power(x,m),Power(Plus(Times(d,f),Times(e,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x)),And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(d,g)))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(Times(d,f),Times(e,g,Sqr(x)))),Power(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x)))),CN1),Int(Times(Power(x,m),Power(Plus(Times(d,f),Times(e,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x)),And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(d,g)))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x))),
ISetDelayed(Int(Times(x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcSin(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),CN1)),Times(CN1,b,c,Power(Times(C2,e,Plus(p,C1)),CN1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCos(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),CN1)),Times(b,c,Power(Times(C2,e,Plus(p,C1)),CN1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcSin(Times(c,x)))),u,x),Times(CN1,b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x)))),And(FreeQ(List(a,b,c,d,e,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcCos(Times(c,x)))),u,x),Times(b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x)))),And(FreeQ(List(a,b,c,d,e,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))))),
ISetDelayed(Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(C2,e,Plus(p,C1)),CN1)),Times(b,n,Power(Times(C2,c,Sqrt(d),Plus(p,C1)),CN1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Times(CN1,C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(n)),Greater(n,C0)),Unequal(p,CN1)))),
ISetDelayed(Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(C2,e,Plus(p,C1)),CN1)),Times(CN1,b,n,Power(Times(C2,c,Sqrt(d),Plus(p,C1)),CN1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Times(CN1,C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(n)),Greater(n,C0)),Unequal(p,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Plus(m,C1),CN1)),Times(CN1,b,c,Sqrt(d),n,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(CN1,C2,e,p,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Greater(p,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Plus(m,C1),CN1)),Times(b,c,Sqrt(d),n,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(CN1,C2,e,p,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Greater(p,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Plus(m,Times(C2,p),C1),CN1)),Times(CN1,b,c,n,Sqrt(d),Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(C2,d,p,Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Greater(p,C0)),Unequal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Plus(m,Times(C2,p),C1),CN1)),Times(b,c,n,Sqrt(d),Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(C2,d,p,Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Greater(p,C0)),Unequal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(d,Plus(m,C1)),CN1)),Times(CN1,b,c,n,Power(Times(Sqrt(d),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Less(p,C0)),Unequal(m,CN1)),Equal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(d,Plus(m,C1)),CN1)),Times(b,c,n,Power(Times(Sqrt(d),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Less(p,C0)),Unequal(m,CN1)),Equal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcSin(Times(c,x)))),Hypergeometric2F1(C1D2,Times(C1D2,Plus(C1,m)),Times(C1D2,Plus(C3,m)),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(d),Plus(m,C1)),CN1)),Times(CN1,b,c,Power(x,Plus(m,C2)),HypergeometricPFQ(List(C1,Plus(C1,Times(C1D2,m)),Plus(C1,Times(C1D2,m))),List(Plus(QQ(3L,2L),Times(C1D2,m)),Plus(C2,Times(C1D2,m))),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(d),Plus(m,C1),Plus(m,C2)),CN1))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(x_,m_),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcCos(Times(c,x)))),Hypergeometric2F1(C1D2,Times(C1D2,Plus(C1,m)),Times(C1D2,Plus(C3,m)),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(d),Plus(m,C1)),CN1)),Times(b,c,Power(x,Plus(m,C2)),HypergeometricPFQ(List(C1,Plus(C1,Times(C1D2,m)),Plus(C1,Times(C1D2,m))),List(Plus(QQ(3L,2L),Times(C1D2,m)),Plus(C2,Times(C1D2,m))),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(d),Plus(m,C1),Plus(m,C2)),CN1))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Times(Power(Times(Power(c,Plus(m,C1)),d),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sin(x),m),Sec(x)),x),x,ArcSin(Times(c,x)))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)),PositiveIntegerQ(n)),IntegerQ(m)),Equal(Sqr(m),C1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Times(CN1,Power(Times(Power(c,Plus(m,C1)),d),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cos(x),m),Csc(x)),x),x,ArcCos(Times(c,x)))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)),PositiveIntegerQ(n)),IntegerQ(m)),Equal(Sqr(m),C1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(e,Plus(m,Times(C2,p),C1)),CN1)),Times(CN1,b,c,Sqrt(d),n,Power(Times(e,Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),And(LessEqual(CN1,p),Less(p,C0))),Greater(m,C1)),NonzeroQ(Plus(m,Times(C2,p),C1))))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(e,Plus(m,Times(C2,p),C1)),CN1)),Times(b,c,Sqrt(d),n,Power(Times(e,Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),And(LessEqual(CN1,p),Less(p,C0))),Greater(m,C1)),NonzeroQ(Plus(m,Times(C2,p),C1))))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(C2,e,Plus(p,C1)),CN1)),Times(b,n,Power(Times(C2,c,Sqrt(d),Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(C2,e,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Less(p,CN1)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(C2,e,Plus(p,C1)),CN1)),Times(CN1,b,n,Power(Times(C2,c,Sqrt(d),Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(C2,e,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Less(p,CN1)),Greater(m,C1)))),
ISetDelayed(Int(Times(ArcSin(Times(c_DEFAULT,x_)),Power(Times(x_,Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(CN2,CI,ArcSin(Times(c,x)),ArcTan(Plus(Times(c,x),Times(CN1,CI,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))))),Power(d,CN1D2)),Times(CI,PolyLog(C2,Plus(Times(CN1,CI,c,x),Times(CN1,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))))),Power(d,CN1D2)),Times(CN1,CI,PolyLog(C2,Plus(Times(CI,c,x),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))))),Power(d,CN1D2))),And(And(FreeQ(List(c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)))),
ISetDelayed(Int(Times(ArcCos(Times(c_DEFAULT,x_)),Power(Times(x_,Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(C2,CI,ArcCos(Times(c,x)),ArcTan(Plus(Times(c,x),Times(CI,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))))),Power(d,CN1D2)),Times(CN1,CI,PolyLog(C2,Plus(Times(CN1,CI,c,x),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))))),Power(d,CN1D2)),Times(CI,PolyLog(C2,Plus(Times(CI,c,x),Times(CN1,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x))))))),Power(d,CN1D2))),And(And(FreeQ(List(c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),Power(Times(x_,Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(a,Int(Power(Times(x,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1),x)),Times(b,Int(Times(ArcSin(Times(c,x)),Power(Times(x,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),Power(Times(x_,Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(a,Int(Power(Times(x,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1),x)),Times(b,Int(Times(ArcCos(Times(c,x)),Power(Times(x,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(x_,CN1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Sqr(c),Int(Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x)),Times(Power(d,CN1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(x,CN1)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(n)),Greater(n,C0)),Less(p,CN1)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(x_,CN1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Sqr(c),Int(Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x)),Times(Power(d,CN1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(x,CN1)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(n)),Greater(n,C0)),Less(p,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Times(d,Plus(m,C1)),CN1)),Times(CN1,b,c,n,Power(Times(Sqrt(d),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(Sqr(c),Plus(m,Times(C2,p),C3),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Less(p,C0)),Less(m,CN1)),Unequal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Times(d,Plus(m,C1)),CN1)),Times(b,c,n,Power(Times(Sqrt(d),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,Times(CN1,C1)))),x)),Times(Sqr(c),Plus(m,Times(C2,p),C3),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Greater(n,C0)),Less(p,C0)),Less(m,CN1)),Unequal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1)),Times(CN1,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)),RationalQ(n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,m),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1)),Times(m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)),RationalQ(n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1)),Times(CN1,d,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Less(n,CN1)),Equal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1)),Times(d,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Less(n,CN1)),Equal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1)),Times(CN1,d,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x)),Times(CN1,e,Plus(m,Times(C2,p),C1),Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1)),Times(d,m,Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x)),Times(e,Plus(m,Times(C2,p),C1),Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Times(C2,p))),PositiveQ(d)),RationalQ(m,n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(d,CN1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x)),Times(CN1,e,Power(d,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),NegativeIntegerQ(Plus(p,C1D2))),PositiveQ(d)),NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(d,CN1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x)),Times(CN1,e,Power(d,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),NegativeIntegerQ(Plus(p,C1D2))),PositiveQ(d)),NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Power(Times(Power(c,Plus(m,C1)),Sqrt(d)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sin(x),m)),x),x,ArcSin(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)),IntegerQ(m)),Or(Greater(m,C0),PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(CN1,Power(Times(Power(c,Plus(m,C1)),Sqrt(d)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cos(x),m)),x),x,ArcCos(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)),IntegerQ(m)),Or(Greater(m,C0),PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,p),Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sin(x),m),Power(Cos(x),Plus(Times(C2,p),C1))),x),x,ArcSin(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(Times(C2,p))),PositiveQ(d)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(d,p),Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cos(x),m),Power(Sin(x),Plus(Times(C2,p),C1))),x),x,ArcCos(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(Times(C2,p))),PositiveQ(d)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2))),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(Plus(p,C1D2))),PositiveQ(d)),Not(PositiveIntegerQ(Times(C1D2,Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1D2))),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(Plus(p,C1D2))),PositiveQ(d)),Not(PositiveIntegerQ(Times(C1D2,Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,p),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(p)),Not(PositiveQ(d))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,p),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(p)),Not(PositiveQ(d))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSin(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSin(Times(c,x)))),n)),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(Plus(p,C1D2))),Not(PositiveQ(d))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCos(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcCos(Times(c,x)))),n)),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(Plus(p,C1D2))),Not(PositiveQ(d)))))
  );
}
