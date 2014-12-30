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
public class IntRules110 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(e,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n)),x)),Times(CN1,d,Power(e,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegersQ(m,n,Times(C2,p))),Less(p,CN1)),Greater(m,C1)),Unequal(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(e,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n)),x)),Times(CN1,d,Power(e,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegersQ(m,n,Times(C2,p))),Less(p,CN1)),Greater(m,C1)),Unequal(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(d,CN1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n)),x)),Times(CN1,e,Power(d,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegersQ(m,n,Times(C2,p))),Less(p,CN1)),Less(m,C0)),Unequal(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(d,CN1),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n)),x)),Times(CN1,e,Power(d,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegersQ(m,n,Times(C2,p))),Less(p,CN1)),Less(m,C0)),Unequal(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,d,Plus(n,C1)),CN1)),Times(CN1,m,Power(Times(b,c,Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(n,C1))),x)),Times(CN1,c,Plus(m,Times(C2,p),C2),Power(Times(b,Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(m,n,p)),Less(p,CN1)),Less(n,CN1)),NonzeroQ(Plus(m,Times(C2,p),C2))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,d,Plus(n,C1)),CN1)),Times(m,Power(Times(b,c,Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(n,C1))),x)),Times(c,Plus(m,Times(C2,p),C2),Power(Times(b,Plus(n,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(m,n,p)),Less(p,CN1)),Less(n,CN1)),NonzeroQ(Plus(m,Times(C2,p),C2))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,p),Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sin(x),m),Power(Power(Cos(x),Plus(m,Times(C2,Plus(p,C1)))),CN1)),x),x,ArcTan(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),PositiveIntegerQ(m)),NegativeIntegerQ(Plus(m,Times(C2,p),C1))),Or(IntegerQ(p),PositiveQ(d))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,Plus(p,C1D2)),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n)),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),PositiveIntegerQ(m)),NegativeIntegerQ(Plus(m,Times(C2,p),C1))),Not(Or(IntegerQ(p),PositiveQ(d)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(d,p),Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cos(x),m),Power(Power(Sin(x),Plus(m,Times(C2,Plus(p,C1)))),CN1)),x),x,ArcCot(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),PositiveIntegerQ(m)),NegativeIntegerQ(Plus(m,Times(C2,p),C1))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(d,Plus(p,C1D2)),x,Sqrt(Times(Plus(C1,Times(Sqr(c),Sqr(x))),Power(Times(Sqr(c),Sqr(x)),CN1))),Power(Times(Power(c,m),Sqrt(Plus(d,Times(e,Sqr(x))))),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cos(x),m),Power(Power(Sin(x),Plus(m,Times(C2,Plus(p,C1)))),CN1)),x),x,ArcCot(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),PositiveIntegerQ(m)),NegativeIntegerQ(Plus(m,Times(C2,p),C1))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),CN1)),Times(CN1,b,c,Power(Times(C2,e,Plus(p,C1)),CN1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),CN1)),Times(b,c,Power(Times(C2,e,Plus(p,C1)),CN1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcTan(Times(c,x)))),u,x),Times(CN1,b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,d,e,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcCot(Times(c,x)))),u,x),Times(b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,d,e,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x),x),And(And(And(FreeQ(List(a,b,c,d,e,m),x),IntegerQ(p)),PositiveIntegerQ(n)),Or(Greater(p,C0),And(And(Less(p,CN1),IntegerQ(m)),Unequal(m,C1)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x),x),And(And(And(FreeQ(List(a,b,c,d,e,m),x),IntegerQ(p)),PositiveIntegerQ(n)),Or(Greater(p,C0),And(And(Less(p,CN1),IntegerQ(m)),Unequal(m,C1)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(a,Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x)),Times(b,Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p),ArcTan(Times(c,x))),x))),FreeQ(List(a,b,c,d,e,m,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(a,Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x)),Times(b,Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p),ArcCot(Times(c,x))),x))),FreeQ(List(a,b,c,d,e,m,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,m,n,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,m,n,p),x))),
ISetDelayed(Int(Times(ArcTanh(u_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Plus(C1,u)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(Plus(C1,Times(CN1,u))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(ArcCoth(u_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(SimplifyIntegrand(Plus(C1,Power(u,CN1)),x)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(SimplifyIntegrand(Plus(C1,Times(CN1,Power(u,CN1))),x)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(ArcTanh(u_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Plus(C1,u)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(Plus(C1,Times(CN1,u))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(ArcCoth(u_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(SimplifyIntegrand(Plus(C1,Power(u,CN1)),x)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1)),x)),Times(CN1,C1D2,Int(Times(Log(SimplifyIntegrand(Plus(C1,Times(CN1,Power(u,CN1))),x)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT),Log(u_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Times(C2,c,d),CN1)),Times(CN1,b,n,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(n,Times(CN1,C1))),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(Plus(C1,Times(CN1,u))),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT),Log(u_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Times(C2,c,d),CN1)),Times(b,n,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(n,Times(CN1,C1))),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(Plus(C1,Times(CN1,u))),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT),Log(u_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Times(C2,c,d),CN1)),Times(b,n,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(n,Times(CN1,C1))),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(Plus(C1,Times(CN1,u))),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT),Log(u_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Times(C2,c,d),CN1)),Times(CN1,b,n,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(n,Times(CN1,C1))),PolyLog(C2,Together(Plus(C1,Times(CN1,u)))),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(Plus(C1,Times(CN1,u))),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT),PolyLog(p_,u_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),PolyLog(Plus(p,C1),u),Power(Times(C2,c,d),CN1)),Times(b,n,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(n,Times(CN1,C1))),PolyLog(Plus(p,C1),u),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT),PolyLog(p_,u_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),PolyLog(Plus(p,C1),u),Power(Times(C2,c,d),CN1)),Times(CN1,b,n,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(n,Times(CN1,C1))),PolyLog(Plus(p,C1),u),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT),PolyLog(p_,u_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),PolyLog(Plus(p,C1),u),Power(Times(C2,c,d),CN1)),Times(CN1,b,n,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(n,Times(CN1,C1))),PolyLog(Plus(p,C1),u),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT),PolyLog(p_,u_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),PolyLog(Plus(p,C1),u),Power(Times(C2,c,d),CN1)),Times(b,n,C1D2,CI,Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(n,Times(CN1,C1))),PolyLog(Plus(p,C1),u),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),RationalQ(n)),Greater(n,C0)),ZeroQ(Plus(Sqr(u),Times(CN1,Sqr(Plus(C1,Times(CN1,C2,CI,Power(Plus(CI,Times(CN1,c,x)),CN1)))))))))),
ISetDelayed(Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Plus(d_,Times(e_DEFAULT,Sqr(x_))),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),CN1),x_Symbol),
    Condition(Times(Plus(Times(CN1,Log(Plus(a,Times(b,ArcCot(Times(c,x)))))),Log(Plus(a,Times(b,ArcTan(Times(c,x)))))),Power(Times(b,c,d,Plus(Times(C2,a),Times(b,ArcCot(Times(c,x))),Times(b,ArcTan(Times(c,x))))),CN1)),And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),n),Power(Times(b,c,d,Plus(m,C1)),CN1)),Times(n,Power(Plus(m,C1),CN1),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(n,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegersQ(m,n)),And(Less(C0,n),LessEqual(n,m))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),n),Power(Times(b,c,d,Plus(m,C1)),CN1)),Times(n,Power(Plus(m,C1),CN1),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(n,Times(CN1,C1))),Power(Plus(d,Times(e,Sqr(x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegersQ(m,n)),Less(Less(C0,n),m)))),
ISetDelayed(Int(Times(ArcTan(Times(a_DEFAULT,x_)),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Log(Plus(C1,Times(CN1,CI,a,x))),Power(Plus(c,Times(d,Power(x,n))),CN1)),x)),Times(CN1,C1D2,CI,Int(Times(Log(Plus(C1,Times(CI,a,x))),Power(Plus(c,Times(d,Power(x,n))),CN1)),x))),And(And(FreeQ(List(a,c,d),x),IntegerQ(n)),Not(And(Equal(n,C2),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))))))),
ISetDelayed(Int(Times(ArcCot(Times(a_DEFAULT,x_)),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),CN1)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Log(Plus(C1,Times(CN1,CI,Power(Times(a,x),CN1)))),Power(Plus(c,Times(d,Power(x,n))),CN1)),x)),Times(CN1,C1D2,CI,Int(Times(Log(Plus(C1,Times(CI,Power(Times(a,x),CN1)))),Power(Plus(c,Times(d,Power(x,n))),CN1)),x))),And(And(FreeQ(List(a,c,d),x),IntegerQ(n)),Not(And(Equal(n,C2),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Times(x,Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x))))))),Times(CN1,C2,e,g,Int(Times(Sqr(x),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),CN1)),x)),Times(CN1,b,c,Int(Times(x,Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),FreeQ(List(a,b,c,d,e,f,g),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Times(x,Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x))))))),Times(CN1,C2,e,g,Int(Times(Sqr(x),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),CN1)),x)),Times(b,c,Int(Times(x,Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),FreeQ(List(a,b,c,d,e,f,g),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Power(x_,m_DEFAULT),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(m,C1),CN1)),Times(CN1,C2,e,g,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),CN1)),x)),Times(CN1,b,c,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),NegativeIntegerQ(Times(C1D2,m))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Power(x_,m_DEFAULT),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(m,C1),CN1)),Times(CN1,C2,e,g,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(f,Times(g,Sqr(x))),CN1)),x)),Times(b,c,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),NegativeIntegerQ(Times(C1D2,m))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Power(x_,m_DEFAULT),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x))))))),x)))),Plus(Dist(Plus(a,Times(b,ArcTan(Times(c,x)))),u,x),Times(CN1,b,c,Int(ExpandIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),PositiveIntegerQ(Times(C1D2,Plus(m,C1)))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Power(x_,m_DEFAULT),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x))))))),x)))),Plus(Dist(Plus(a,Times(b,ArcCot(Times(c,x)))),u,x),Times(b,c,Int(ExpandIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),PositiveIntegerQ(Times(C1D2,Plus(m,C1)))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),Power(x_,m_DEFAULT),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Plus(a,Times(b,ArcTan(Times(c,x))))),x)))),Plus(Dist(Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),u,x),Times(CN1,C2,e,g,Int(ExpandIntegrand(Times(x,u,Power(Plus(f,Times(g,Sqr(x))),CN1)),x),x)))),And(And(FreeQ(List(a,b,c,d,e,f,g),x),IntegerQ(m)),Unequal(m,CN1)))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),Power(x_,m_DEFAULT),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_DEFAULT,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Plus(a,Times(b,ArcCot(Times(c,x))))),x)))),Plus(Dist(Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),u,x),Times(CN1,C2,e,g,Int(ExpandIntegrand(Times(x,u,Power(Plus(f,Times(g,Sqr(x))),CN1)),x),x)))),And(And(FreeQ(List(a,b,c,d,e,f,g),x),IntegerQ(m)),Unequal(m,CN1)))),
ISetDelayed(Int(Times(x_,Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Times(Plus(f,Times(g,Sqr(x))),Sqr(Plus(a,Times(b,ArcTan(Times(c,x))))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Times(C2,g),CN1)),Times(CN1,e,Sqr(x),C1D2,Sqr(Plus(a,Times(b,ArcTan(Times(c,x)))))),Times(CN1,b,Power(c,CN1),Int(Times(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x))))))),x)),Times(b,c,e,Int(Times(Sqr(x),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(g,Times(CN1,Sqr(c),f)))))),
ISetDelayed(Int(Times(x_,Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Plus(f_,Times(g_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Times(Plus(f,Times(g,Sqr(x))),Sqr(Plus(a,Times(b,ArcCot(Times(c,x))))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x)))))),Power(Times(C2,g),CN1)),Times(CN1,e,Sqr(x),C1D2,Sqr(Plus(a,Times(b,ArcCot(Times(c,x)))))),Times(b,Power(c,CN1),Int(Times(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(d,Times(e,Log(Plus(f,Times(g,Sqr(x))))))),x)),Times(CN1,b,c,e,Int(Times(Sqr(x),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(g,Times(CN1,Sqr(c),f)))))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT),x_Symbol),
    Condition(Times(Power(d,CN1),Subst(Int(Power(Plus(a,Times(b,ArcTan(x))),n),x),x,Plus(c,Times(d,x)))),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(n)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT),x_Symbol),
    Condition(Times(Power(d,CN1),Subst(Int(Power(Plus(a,Times(b,ArcCot(x))),n),x),x,Plus(c,Times(d,x)))),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(n)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition($(Defer($s("Int")),Power(Plus(a,Times(b,ArcTan(Plus(c,Times(d,x))))),n),x),And(FreeQ(List(a,b,c,d,n),x),Not(PositiveIntegerQ(n))))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),n_),x_Symbol),
    Condition($(Defer($s("Int")),Power(Plus(a,Times(b,ArcCot(Plus(c,Times(d,x))))),n),x),And(FreeQ(List(a,b,c,d,n),x),Not(PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,CN1)),Times(f,x,Power(d,CN1))),m),Power(Plus(a,Times(b,ArcTan(x))),n)),x),x,Plus(c,Times(d,x)))),And(FreeQ(List(a,b,c,d,e,f,m,n),x),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,CN1)),Times(f,x,Power(d,CN1))),m),Power(Plus(a,Times(b,ArcCot(x))),n)),x),x,Plus(c,Times(d,x)))),And(FreeQ(List(a,b,c,d,e,f,m,n),x),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,ArcTan(Plus(c,Times(d,x))))),n)),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),Not(PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,ArcCot(Plus(c,Times(d,x))))),n)),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),Not(PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(Plus($p("A",true),Times($p("B",true),x_),Times($p("C",true),Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,CN1),Subst(Int(Times(Power(Plus(Times($s("C"),Power(d,CN2)),Times($s("C"),Power(d,CN2),Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(x))),n)),x),x,Plus(c,Times(d,x)))),And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),$s("C"),n,p),x),ZeroQ(Plus(Times($s("B"),Plus(C1,Sqr(c))),Times(CN1,C2,$s("A"),c,d)))),ZeroQ(Plus(Times(C2,c,$s("C")),Times(CN1,$s("B"),d)))))),
ISetDelayed(Int(Times(Power(Plus($p("A",true),Times($p("B",true),x_),Times($p("C",true),Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,CN1),Subst(Int(Times(Power(Plus(Times($s("C"),Power(d,CN2)),Times($s("C"),Power(d,CN2),Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(x))),n)),x),x,Plus(c,Times(d,x)))),And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),$s("C"),n,p),x),ZeroQ(Plus(Times($s("B"),Plus(C1,Sqr(c))),Times(CN1,C2,$s("A"),c,d)))),ZeroQ(Plus(Times(C2,c,$s("C")),Times(CN1,$s("B"),d)))))),
ISetDelayed(Int(Times(Power(Plus($p("A",true),Times($p("B",true),x_),Times($p("C",true),Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,CN1)),Times(f,x,Power(d,CN1))),m),Power(Plus(Times($s("C"),Power(d,CN2)),Times($s("C"),Power(d,CN2),Sqr(x))),p),Power(Plus(a,Times(b,ArcTan(x))),n)),x),x,Plus(c,Times(d,x)))),And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B"),$s("C"),m,n,p),x),ZeroQ(Plus(Times($s("B"),Plus(C1,Sqr(c))),Times(CN1,C2,$s("A"),c,d)))),ZeroQ(Plus(Times(C2,c,$s("C")),Times(CN1,$s("B"),d)))))),
ISetDelayed(Int(Times(Power(Plus($p("A",true),Times($p("B",true),x_),Times($p("C",true),Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,CN1)),Times(f,x,Power(d,CN1))),m),Power(Plus(Times($s("C"),Power(d,CN2)),Times($s("C"),Power(d,CN2),Sqr(x))),p),Power(Plus(a,Times(b,ArcCot(x))),n)),x),x,Plus(c,Times(d,x)))),And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B"),$s("C"),m,n,p),x),ZeroQ(Plus(Times($s("B"),Plus(C1,Sqr(c))),Times(CN1,C2,$s("A"),c,d)))),ZeroQ(Plus(Times(C2,c,$s("C")),Times(CN1,$s("B"),d))))))
  );
}
