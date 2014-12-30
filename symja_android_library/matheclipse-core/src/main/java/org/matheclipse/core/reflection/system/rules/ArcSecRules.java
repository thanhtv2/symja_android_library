package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface ArcSecRules {
  final public static IAST RULES = List(
    ISet(ArcSec(C0),
      CComplexInfinity),
    ISet(ArcSec(C1),
      C0),
    ISet(ArcSec(CN1),
      Pi),
    ISet(ArcSec(Plus(Times(CN1,CSqrt2),CSqrt6)),
      Times(QQ(1L,12L),Pi)),
    ISet(ArcSec(Plus(CSqrt2,Times(CN1,CSqrt6))),
      Times(QQ(11L,12L),Pi)),
    ISet(ArcSec(Times(C2,C1DSqrt3)),
      Times(QQ(1L,6L),Pi)),
    ISet(ArcSec(Times(CN2,C1DSqrt3)),
      Times(QQ(5L,6L),Pi)),
    ISet(ArcSec(Plus(CN1,CSqrt5)),
      Times(QQ(1L,5L),Pi)),
    ISet(ArcSec(Plus(C1,Times(CN1,CSqrt5))),
      Times(QQ(4L,5L),Pi)),
    ISet(ArcSec(CSqrt2),
      Times(C1D4,Pi)),
    ISet(ArcSec(Times(CN1,CSqrt2)),
      Times(QQ(3L,4L),Pi)),
    ISet(ArcSec(C2),
      Times(C1D3,Pi)),
    ISet(ArcSec(CN2),
      Times(QQ(2L,3L),Pi)),
    ISet(ArcSec(Plus(C1,CSqrt5)),
      Times(QQ(1L,5L),Pi)),
    ISet(ArcSec(Plus(CN1,Times(CN1,CSqrt5))),
      Times(QQ(3L,5L),Pi)),
    ISet(ArcSec(Plus(CSqrt2,CSqrt6)),
      Times(QQ(5L,12L),Pi)),
    ISet(ArcSec(Plus(Times(CN1,CSqrt2),Times(CN1,CSqrt6))),
      Times(QQ(7L,12L),Pi)),
    ISet(ArcSec(CI),
      Plus(Times(C1D2,Pi),Times(CI,Log(Plus(C1,CSqrt2))))),
    ISet(ArcSec(CNI),
      Plus(Times(C1D2,Pi),Times(CI,Log(Plus(CN1,CSqrt2))))),
    ISet(ArcSec(CInfinity),
      Times(C1D2,Pi)),
    ISet(ArcSec(CNInfinity),
      Times(C1D2,Pi)),
    ISet(ArcSec(DirectedInfinity(CI)),
      Times(C1D2,Pi)),
    ISet(ArcSec(DirectedInfinity(CNI)),
      Times(C1D2,Pi)),
    ISet(ArcSec(CComplexInfinity),
      Times(C1D2,Pi))
  );
}
