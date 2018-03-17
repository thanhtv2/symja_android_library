package org.matheclipse.core.expression;

import org.matheclipse.core.interfaces.IBuiltInSymbol;

public enum BuiltIns {
 Abort( "abort", 0 ), //
 Abs( "abs", 1 ), //
 AbsArg( "absarg", 2 ), //
 Accumulate( "accumulate", 3 ), //
 AddTo( "addto", 4 ), //
 AlgebraicNumber( "algebraicnumber", 5 ), //
 Algebraics( "algebraics", 6 ), //
 All( "all", 7 ), //
 AllTrue( "alltrue", 8 ), //
 Alternatives( "alternatives", 9 ), //
 And( "and", 10 ), //
 AngleVector( "anglevector", 11 ), //
 AntihermitianMatrixQ( "antihermitianmatrixq", 12 ), //
 AntisymmetricMatrixQ( "antisymmetricmatrixq", 13 ), //
 AnyTrue( "anytrue", 14 ), //
 Apart( "apart", 15 ), //
 AppellF1( "appellf1", 16 ), //
 Append( "append", 17 ), //
 AppendTo( "appendto", 18 ), //
 Apply( "apply", 19 ), //
 ArcCos( "arccos", 20 ), //
 ArcCosh( "arccosh", 21 ), //
 ArcCot( "arccot", 22 ), //
 ArcCoth( "arccoth", 23 ), //
 ArcCsc( "arccsc", 24 ), //
 ArcCsch( "arccsch", 25 ), //
 ArcSec( "arcsec", 26 ), //
 ArcSech( "arcsech", 27 ), //
 ArcSin( "arcsin", 28 ), //
 ArcSinh( "arcsinh", 29 ), //
 ArcTan( "arctan", 30 ), //
 ArcTanh( "arctanh", 31 ), //
 Arg( "arg", 32 ), //
 Array( "array", 33 ), //
 ArrayDepth( "arraydepth", 34 ), //
 ArrayPad( "arraypad", 35 ), //
 ArrayQ( "arrayq", 36 ), //
 Assumptions( "assumptions", 37 ), //
 AtomQ( "atomq", 38 ), //
 Attributes( "attributes", 39 ), //
 Automatic( "automatic", 40 ), //
 Axes( "axes", 41 ), //
 AxesOrigin( "axesorigin", 42 ), //
 AxesStyle( "axesstyle", 43 ), //
 Background( "background", 44 ), //
 Begin( "begin", 45 ), //
 BeginPackage( "beginpackage", 46 ), //
 BellB( "bellb", 47 ), //
 BellY( "belly", 48 ), //
 BernoulliB( "bernoullib", 49 ), //
 BernoulliDistribution( "bernoullidistribution", 50 ), //
 BesselI( "besseli", 51 ), //
 BesselJ( "besselj", 52 ), //
 BesselK( "besselk", 53 ), //
 BesselY( "bessely", 54 ), //
 Beta( "beta", 55 ), //
 BetaRegularized( "betaregularized", 56 ), //
 BinCounts( "bincounts", 57 ), //
 Binomial( "binomial", 58 ), //
 BinomialDistribution( "binomialdistribution", 59 ), //
 BitLength( "bitlength", 60 ), //
 Blank( "blank", 61 ), //
 Block( "block", 62 ), //
 Boole( "boole", 63 ), //
 BooleanConvert( "booleanconvert", 64 ), //
 BooleanMinimize( "booleanminimize", 65 ), //
 BooleanQ( "booleanq", 66 ), //
 BooleanTable( "booleantable", 67 ), //
 BooleanVariables( "booleanvariables", 68 ), //
 Booleans( "booleans", 69 ), //
 BrayCurtisDistance( "braycurtisdistance", 70 ), //
 Break( "break", 71 ), //
 CDF( "cdf", 72 ), //
 CanberraDistance( "canberradistance", 73 ), //
 Cancel( "cancel", 74 ), //
 CarmichaelLambda( "carmichaellambda", 75 ), //
 CartesianProduct( "cartesianproduct", 76 ), //
 Cases( "cases", 77 ), //
 Catalan( "catalan", 78 ), //
 CatalanNumber( "catalannumber", 79 ), //
 Catch( "catch", 80 ), //
 Catenate( "catenate", 81 ), //
 Ceiling( "ceiling", 82 ), //
 CentralMoment( "centralmoment", 83 ), //
 CharacterEncoding( "characterencoding", 84 ), //
 CharacteristicPolynomial( "characteristicpolynomial", 85 ), //
 ChebyshevT( "chebyshevt", 86 ), //
 ChebyshevU( "chebyshevu", 87 ), //
 ChessboardDistance( "chessboarddistance", 88 ), //
 ChineseRemainder( "chineseremainder", 89 ), //
 CholeskyDecomposition( "choleskydecomposition", 90 ), //
 Chop( "chop", 91 ), //
 CirclePoints( "circlepoints", 92 ), //
 Clear( "clear", 93 ), //
 ClearAll( "clearall", 94 ), //
 ClearAttributes( "clearattributes", 95 ), //
 Clip( "clip", 96 ), //
 Coefficient( "coefficient", 97 ), //
 CoefficientList( "coefficientlist", 98 ), //
 CoefficientRules( "coefficientrules", 99 ), //
 Collect( "collect", 100 ), //
 Colon( "colon", 101 ), //
 Commonest( "commonest", 102 ), //
 Compile( "compile", 103 ), //
 Complement( "complement", 104 ), //
 Complex( "complex", 105 ), //
 ComplexExpand( "complexexpand", 106 ), //
 ComplexInfinity( "complexinfinity", 107 ), //
 Complexes( "complexes", 108 ), //
 ComplexityFunction( "complexityfunction", 109 ), //
 ComposeList( "composelist", 110 ), //
 ComposeSeries( "composeseries", 111 ), //
 Composition( "composition", 112 ), //
 CompoundExpression( "compoundexpression", 113 ), //
 Condition( "condition", 114 ), //
 Conjugate( "conjugate", 115 ), //
 ConjugateTranspose( "conjugatetranspose", 116 ), //
 Constant( "constant", 117 ), //
 ConstantArray( "constantarray", 118 ), //
 Continue( "continue", 119 ), //
 ContinuedFraction( "continuedfraction", 120 ), //
 ConvexHullMesh( "convexhullmesh", 121 ), //
 CoprimeQ( "coprimeq", 122 ), //
 Correlation( "correlation", 123 ), //
 Cos( "cos", 124 ), //
 CosIntegral( "cosintegral", 125 ), //
 Cosh( "cosh", 126 ), //
 CoshIntegral( "coshintegral", 127 ), //
 CosineDistance( "cosinedistance", 128 ), //
 Cot( "cot", 129 ), //
 Coth( "coth", 130 ), //
 Count( "count", 131 ), //
 Covariance( "covariance", 132 ), //
 Cross( "cross", 133 ), //
 Csc( "csc", 134 ), //
 Csch( "csch", 135 ), //
 CubeRoot( "cuberoot", 136 ), //
 Curl( "curl", 137 ), //
 D( "D", 138 ), //
 DSolve( "dsolve", 139 ), //
 Decrement( "decrement", 140 ), //
 Default( "default", 141 ), //
 Defer( "defer", 142 ), //
 Definition( "definition", 143 ), //
 Degree( "degree", 144 ), //
 Delete( "delete", 145 ), //
 DeleteCases( "deletecases", 146 ), //
 DeleteDuplicates( "deleteduplicates", 147 ), //
 Denominator( "denominator", 148 ), //
 Depth( "depth", 149 ), //
 Derivative( "derivative", 150 ), //
 DesignMatrix( "designmatrix", 151 ), //
 Det( "det", 152 ), //
 Diagonal( "diagonal", 153 ), //
 DiagonalMatrix( "diagonalmatrix", 154 ), //
 DiceDissimilarity( "dicedissimilarity", 155 ), //
 DigitQ( "digitq", 156 ), //
 Dimensions( "dimensions", 157 ), //
 DiracDelta( "diracdelta", 158 ), //
 DirectedInfinity( "directedinfinity", 159 ), //
 Direction( "direction", 160 ), //
 DiscreteDelta( "discretedelta", 161 ), //
 DiscreteUniformDistribution( "discreteuniformdistribution", 162 ), //
 Discriminant( "discriminant", 163 ), //
 Disputed( "disputed", 164 ), //
 Distribute( "distribute", 165 ), //
 Divergence( "divergence", 166 ), //
 Divide( "divide", 167 ), //
 DivideBy( "divideby", 168 ), //
 Divisible( "divisible", 169 ), //
 DivisorSigma( "divisorsigma", 170 ), //
 Divisors( "divisors", 171 ), //
 Do( "do", 172 ), //
 Dot( "dot", 173 ), //
 Drop( "drop", 174 ), //
 E( "E", 175 ), //
 EasterSunday( "eastersunday", 176 ), //
 Eigenvalues( "eigenvalues", 177 ), //
 Eigenvectors( "eigenvectors", 178 ), //
 Element( "element", 179 ), //
 ElementData( "elementdata", 180 ), //
 Eliminate( "eliminate", 181 ), //
 EllipticE( "elliptice", 182 ), //
 EllipticF( "ellipticf", 183 ), //
 EllipticPi( "ellipticpi", 184 ), //
 End( "end", 185 ), //
 EndPackage( "endpackage", 186 ), //
 Equal( "equal", 187 ), //
 Equivalent( "equivalent", 188 ), //
 Erf( "erf", 189 ), //
 Erfc( "erfc", 190 ), //
 Erfi( "erfi", 191 ), //
 ErlangDistribution( "erlangdistribution", 192 ), //
 EuclideanDistance( "euclideandistance", 193 ), //
 EulerE( "eulere", 194 ), //
 EulerGamma( "eulergamma", 195 ), //
 EulerPhi( "eulerphi", 196 ), //
 EvenQ( "evenq", 197 ), //
 ExactNumberQ( "exactnumberq", 198 ), //
 Except( "except", 199 ), //
 Exists( "exists", 200 ), //
 Exp( "exp", 201 ), //
 ExpIntegralE( "expintegrale", 202 ), //
 ExpIntegralEi( "expintegralei", 203 ), //
 Expand( "expand", 204 ), //
 ExpandAll( "expandall", 205 ), //
 Expectation( "expectation", 206 ), //
 Exponent( "exponent", 207 ), //
 ExponentialDistribution( "exponentialdistribution", 208 ), //
 Export( "export", 209 ), //
 ExtendedGCD( "extendedgcd", 210 ), //
 Extract( "extract", 211 ), //
 Factor( "factor", 212 ), //
 FactorInteger( "factorinteger", 213 ), //
 FactorSquareFree( "factorsquarefree", 214 ), //
 FactorSquareFreeList( "factorsquarefreelist", 215 ), //
 FactorTerms( "factorterms", 216 ), //
 Factorial( "factorial", 217 ), //
 Factorial2( "factorial2", 218 ), //
 False( "false", 219 ), //
 Fibonacci( "fibonacci", 220 ), //
 FindInstance( "findinstance", 221 ), //
 FindRoot( "findroot", 222 ), //
 First( "first", 223 ), //
 Fit( "fit", 224 ), //
 FixedPoint( "fixedpoint", 225 ), //
 FixedPointList( "fixedpointlist", 226 ), //
 Flat( "flat", 227 ), //
 Flatten( "flatten", 228 ), //
 FlattenAt( "flattenat", 229 ), //
 Floor( "floor", 230 ), //
 Fold( "fold", 231 ), //
 FoldList( "foldlist", 232 ), //
 For( "for", 233 ), //
 ForAll( "forall", 234 ), //
 FourierMatrix( "fouriermatrix", 235 ), //
 FractionalPart( "fractionalpart", 236 ), //
 FrechetDistribution( "frechetdistribution", 237 ), //
 FreeQ( "freeq", 238 ), //
 FresnelC( "fresnelc", 239 ), //
 FresnelS( "fresnels", 240 ), //
 FrobeniusSolve( "frobeniussolve", 241 ), //
 FromCharacterCode( "fromcharactercode", 242 ), //
 FromContinuedFraction( "fromcontinuedfraction", 243 ), //
 FromPolarCoordinates( "frompolarcoordinates", 244 ), //
 FullForm( "fullform", 245 ), //
 FullSimplify( "fullsimplify", 246 ), //
 Function( "function", 247 ), //
 GCD( "gcd", 248 ), //
 Gamma( "gamma", 249 ), //
 GammaDistribution( "gammadistribution", 250 ), //
 GammaRegularized( "gammaregularized", 251 ), //
 Gather( "gather", 252 ), //
 GegenbauerC( "gegenbauerc", 253 ), //
 GeometricDistribution( "geometricdistribution", 254 ), //
 GeometricMean( "geometricmean", 255 ), //
 Get( "get", 256 ), //
 Glaisher( "glaisher", 257 ), //
 GoldenRatio( "goldenratio", 258 ), //
 Graphics( "graphics", 259 ), //
 Graphics3D( "graphics3d", 260 ), //
 Greater( "greater", 261 ), //
 GreaterEqual( "greaterequal", 262 ), //
 GroebnerBasis( "groebnerbasis", 263 ), //
 GumbelDistribution( "gumbeldistribution", 264 ), //
 HarmonicNumber( "harmonicnumber", 265 ), //
 Haversine( "haversine", 266 ), //
 Head( "head", 267 ), //
 HeavisideTheta( "heavisidetheta", 268 ), //
 HermiteH( "hermiteh", 269 ), //
 HermitianMatrixQ( "hermitianmatrixq", 270 ), //
 HilbertMatrix( "hilbertmatrix", 271 ), //
 Hold( "hold", 272 ), //
 HoldAll( "holdall", 273 ), //
 HoldFirst( "holdfirst", 274 ), //
 HoldForm( "holdform", 275 ), //
 HoldRest( "holdrest", 276 ), //
 Horner( "horner", 277 ), //
 HornerForm( "hornerform", 278 ), //
 HurwitzZeta( "hurwitzzeta", 279 ), //
 Hypergeometric1F1( "hypergeometric1f1", 280 ), //
 Hypergeometric2F1( "hypergeometric2f1", 281 ), //
 HypergeometricDistribution( "hypergeometricdistribution", 282 ), //
 HypergeometricPFQ( "hypergeometricpfq", 283 ), //
 HypergeometricPFQRegularized( "hypergeometricpfqregularized", 284 ), //
 I( "I", 285 ), //
 Identity( "identity", 286 ), //
 IdentityMatrix( "identitymatrix", 287 ), //
 If( "if", 288 ), //
 Im( "im", 289 ), //
 Implies( "implies", 290 ), //
 Import( "import", 291 ), //
 Increment( "increment", 292 ), //
 Indeterminate( "indeterminate", 293 ), //
 Inequality( "inequality", 294 ), //
 InexactNumberQ( "inexactnumberq", 295 ), //
 Infinity( "infinity", 296 ), //
 Information( "information", 297 ), //
 Inner( "inner", 298 ), //
 Insert( "insert", 299 ), //
 Integer( "integer", 300 ), //
 IntegerExponent( "integerexponent", 301 ), //
 IntegerLength( "integerlength", 302 ), //
 IntegerPart( "integerpart", 303 ), //
 IntegerPartitions( "integerpartitions", 304 ), //
 IntegerQ( "integerq", 305 ), //
 Integers( "integers", 306 ), //
 Integrate( "integrate", 307 ), //
 InterpolatingFunction( "interpolatingfunction", 308 ), //
 InterpolatingPolynomial( "interpolatingpolynomial", 309 ), //
 Interpolation( "interpolation", 310 ), //
 Intersection( "intersection", 311 ), //
 Interval( "interval", 312 ), //
 Inverse( "inverse", 313 ), //
 InverseErf( "inverseerf", 314 ), //
 InverseErfc( "inverseerfc", 315 ), //
 InverseFunction( "inversefunction", 316 ), //
 InverseHaversine( "inversehaversine", 317 ), //
 InverseLaplaceTransform( "inverselaplacetransform", 318 ), //
 InverseSeries( "inverseseries", 319 ), //
 JaccardDissimilarity( "jaccarddissimilarity", 320 ), //
 JacobiMatrix( "jacobimatrix", 321 ), //
 JacobiSymbol( "jacobisymbol", 322 ), //
 JavaForm( "javaform", 323 ), //
 Join( "join", 324 ), //
 KOrderlessPartitions( "korderlesspartitions", 325 ), //
 KPartitions( "kpartitions", 326 ), //
 Khinchin( "khinchin", 327 ), //
 KroneckerDelta( "kroneckerdelta", 328 ), //
 Kurtosis( "kurtosis", 329 ), //
 LCM( "lcm", 330 ), //
 LUDecomposition( "ludecomposition", 331 ), //
 LaguerreL( "laguerrel", 332 ), //
 LaplaceTransform( "laplacetransform", 333 ), //
 Last( "last", 334 ), //
 LeafCount( "leafcount", 335 ), //
 LeastSquares( "leastsquares", 336 ), //
 LegendreP( "legendrep", 337 ), //
 LegendreQ( "legendreq", 338 ), //
 Length( "length", 339 ), //
 Less( "less", 340 ), //
 LessEqual( "lessequal", 341 ), //
 LetterQ( "letterq", 342 ), //
 Level( "level", 343 ), //
 LevelQ( "levelq", 344 ), //
 Limit( "limit", 345 ), //
 Line( "line", 346 ), //
 LinearModelFit( "linearmodelfit", 347 ), //
 LinearProgramming( "linearprogramming", 348 ), //
 LinearSolve( "linearsolve", 349 ), //
 LiouvilleLambda( "liouvillelambda", 350 ), //
 List( "list", 351 ), //
 ListConvolve( "listconvolve", 352 ), //
 ListCorrelate( "listcorrelate", 353 ), //
 ListQ( "listq", 354 ), //
 Listable( "listable", 355 ), //
 Literal( "literal", 356 ), //
 Log( "log", 357 ), //
 Log10( "log10", 358 ), //
 Log2( "log2", 359 ), //
 LogGamma( "loggamma", 360 ), //
 LogIntegral( "logintegral", 361 ), //
 LogNormalDistribution( "lognormaldistribution", 362 ), //
 LogicalExpand( "logicalexpand", 363 ), //
 LogisticSigmoid( "logisticsigmoid", 364 ), //
 LowerCaseQ( "lowercaseq", 365 ), //
 LowerTriangularize( "lowertriangularize", 366 ), //
 LucasL( "lucasl", 367 ), //
 MachineNumberQ( "machinenumberq", 368 ), //
 MangoldtLambda( "mangoldtlambda", 369 ), //
 ManhattanDistance( "manhattandistance", 370 ), //
 MantissaExponent( "mantissaexponent", 371 ), //
 Map( "map", 372 ), //
 MapAll( "mapall", 373 ), //
 MapAt( "mapat", 374 ), //
 MapThread( "mapthread", 375 ), //
 MatchQ( "matchq", 376 ), //
 MatchingDissimilarity( "matchingdissimilarity", 377 ), //
 MathMLForm( "mathmlform", 378 ), //
 MatrixForm( "matrixform", 379 ), //
 MatrixMinimalPolynomial( "matrixminimalpolynomial", 380 ), //
 MatrixPower( "matrixpower", 381 ), //
 MatrixQ( "matrixq", 382 ), //
 MatrixRank( "matrixrank", 383 ), //
 Max( "max", 384 ), //
 MaxIterations( "maxiterations", 385 ), //
 MaxPoints( "maxpoints", 386 ), //
 Mean( "mean", 387 ), //
 MeanDeviation( "meandeviation", 388 ), //
 Median( "median", 389 ), //
 MeijerG( "meijerg", 390 ), //
 MemberQ( "memberq", 391 ), //
 MersennePrimeExponent( "mersenneprimeexponent", 392 ), //
 MersennePrimeExponentQ( "mersenneprimeexponentq", 393 ), //
 MeshRange( "meshrange", 394 ), //
 MessageName( "messagename", 395 ), //
 Method( "method", 396 ), //
 Min( "min", 397 ), //
 MinimalPolynomial( "minimalpolynomial", 398 ), //
 Minus( "minus", 399 ), //
 Missing( "missing", 400 ), //
 MissingQ( "missingq", 401 ), //
 Mod( "mod", 402 ), //
 Module( "module", 403 ), //
 Modulus( "modulus", 404 ), //
 MoebiusMu( "moebiusmu", 405 ), //
 MonomialList( "monomiallist", 406 ), //
 Most( "most", 407 ), //
 Multinomial( "multinomial", 408 ), //
 MultiplicativeOrder( "multiplicativeorder", 409 ), //
 N( "N", 410 ), //
 NDSolve( "ndsolve", 411 ), //
 NFourierTransform( "nfouriertransform", 412 ), //
 NHoldAll( "nholdall", 413 ), //
 NHoldFirst( "nholdfirst", 414 ), //
 NHoldRest( "nholdrest", 415 ), //
 NIntegrate( "nintegrate", 416 ), //
 NMaximize( "nmaximize", 417 ), //
 NMinimize( "nminimize", 418 ), //
 NRoots( "nroots", 419 ), //
 NSolve( "nsolve", 420 ), //
 NakagamiDistribution( "nakagamidistribution", 421 ), //
 Names( "names", 422 ), //
 Nand( "nand", 423 ), //
 Nearest( "nearest", 424 ), //
 Negative( "negative", 425 ), //
 Nest( "nest", 426 ), //
 NestList( "nestlist", 427 ), //
 NestWhile( "nestwhile", 428 ), //
 NestWhileList( "nestwhilelist", 429 ), //
 NextPrime( "nextprime", 430 ), //
 NonCommutativeMultiply( "noncommutativemultiply", 431 ), //
 NonNegative( "nonnegative", 432 ), //
 NonPositive( "nonpositive", 433 ), //
 None( "none", 434 ), //
 NoneTrue( "nonetrue", 435 ), //
 Nonexistent( "nonexistent", 436 ), //
 Nor( "nor", 437 ), //
 Norm( "norm", 438 ), //
 Normal( "normal", 439 ), //
 NormalDistribution( "normaldistribution", 440 ), //
 Normalize( "normalize", 441 ), //
 Not( "not", 442 ), //
 NotApplicable( "notapplicable", 443 ), //
 NotAvailable( "notavailable", 444 ), //
 NotListQ( "notlistq", 445 ), //
 Null( "null", 446 ), //
 NullSpace( "nullspace", 447 ), //
 NumberFieldRootsOfUnity( "numberfieldrootsofunity", 448 ), //
 NumberQ( "numberq", 449 ), //
 Numerator( "numerator", 450 ), //
 NumericFunction( "numericfunction", 451 ), //
 NumericQ( "numericq", 452 ), //
 O( "O", 453 ), //
 OddQ( "oddq", 454 ), //
 OneIdentity( "oneidentity", 455 ), //
 Operate( "operate", 456 ), //
 Optional( "optional", 457 ), //
 Options( "options", 458 ), //
 Or( "or", 459 ), //
 Order( "order", 460 ), //
 OrderedQ( "orderedq", 461 ), //
 Ordering( "ordering", 462 ), //
 Orderless( "orderless", 463 ), //
 OrthogonalMatrixQ( "orthogonalmatrixq", 464 ), //
 Orthogonalize( "orthogonalize", 465 ), //
 Out( "out", 466 ), //
 Outer( "outer", 467 ), //
 PDF( "pdf", 468 ), //
 Package( "package", 469 ), //
 PadLeft( "padleft", 470 ), //
 PadRight( "padright", 471 ), //
 ParametricPlot( "parametricplot", 472 ), //
 Part( "part", 473 ), //
 Partition( "partition", 474 ), //
 PartitionsP( "partitionsp", 475 ), //
 PartitionsQ( "partitionsq", 476 ), //
 Pattern( "pattern", 477 ), //
 PatternTest( "patterntest", 478 ), //
 PerfectNumber( "perfectnumber", 479 ), //
 PerfectNumberQ( "perfectnumberq", 480 ), //
 Permutations( "permutations", 481 ), //
 Pi( "pi", 482 ), //
 Piecewise( "piecewise", 483 ), //
 Plot( "plot", 484 ), //
 Plot3D( "plot3d", 485 ), //
 PlotRange( "plotrange", 486 ), //
 Plus( "plus", 487 ), //
 Pochhammer( "pochhammer", 488 ), //
 Point( "point", 489 ), //
 PoissonDistribution( "poissondistribution", 490 ), //
 PolyGamma( "polygamma", 491 ), //
 PolyLog( "polylog", 492 ), //
 Polygon( "polygon", 493 ), //
 PolynomialExtendedGCD( "polynomialextendedgcd", 494 ), //
 PolynomialGCD( "polynomialgcd", 495 ), //
 PolynomialLCM( "polynomiallcm", 496 ), //
 PolynomialQ( "polynomialq", 497 ), //
 PolynomialQuotient( "polynomialquotient", 498 ), //
 PolynomialQuotientRemainder( "polynomialquotientremainder", 499 ), //
 PolynomialRemainder( "polynomialremainder", 500 ), //
 Position( "position", 501 ), //
 Positive( "positive", 502 ), //
 PossibleZeroQ( "possiblezeroq", 503 ), //
 Power( "power", 504 ), //
 PowerExpand( "powerexpand", 505 ), //
 PowerMod( "powermod", 506 ), //
 PreDecrement( "predecrement", 507 ), //
 PreIncrement( "preincrement", 508 ), //
 PrePlus( "preplus", 509 ), //
 Precision( "precision", 510 ), //
 PrecisionGoal( "precisiongoal", 511 ), //
 Prepend( "prepend", 512 ), //
 PrependTo( "prependto", 513 ), //
 Prime( "prime", 514 ), //
 PrimeOmega( "primeomega", 515 ), //
 PrimePi( "primepi", 516 ), //
 PrimePowerQ( "primepowerq", 517 ), //
 PrimeQ( "primeq", 518 ), //
 Primes( "primes", 519 ), //
 PrimitiveRootList( "primitiverootlist", 520 ), //
 Print( "print", 521 ), //
 Product( "product", 522 ), //
 ProductLog( "productlog", 523 ), //
 Projection( "projection", 524 ), //
 PseudoInverse( "pseudoinverse", 525 ), //
 Put( "put", 526 ), //
 QRDecomposition( "qrdecomposition", 527 ), //
 Quantile( "quantile", 528 ), //
 Quiet( "quiet", 529 ), //
 Quit( "quit", 530 ), //
 Quotient( "quotient", 531 ), //
 QuotientRemainder( "quotientremainder", 532 ), //
 RandomChoice( "randomchoice", 533 ), //
 RandomInteger( "randominteger", 534 ), //
 RandomReal( "randomreal", 535 ), //
 RandomSample( "randomsample", 536 ), //
 RandomVariate( "randomvariate", 537 ), //
 Range( "range", 538 ), //
 Rational( "rational", 539 ), //
 Rationalize( "rationalize", 540 ), //
 Rationals( "rationals", 541 ), //
 Re( "re", 542 ), //
 Real( "real", 543 ), //
 RealNumberQ( "realnumberq", 544 ), //
 Reals( "reals", 545 ), //
 Reap( "reap", 546 ), //
 Rectangle( "rectangle", 547 ), //
 Reduce( "reduce", 548 ), //
 Refine( "refine", 549 ), //
 Repeated( "repeated", 550 ), //
 RepeatedNull( "repeatednull", 551 ), //
 Replace( "replace", 552 ), //
 ReplaceAll( "replaceall", 553 ), //
 ReplaceList( "replacelist", 554 ), //
 ReplacePart( "replacepart", 555 ), //
 ReplaceRepeated( "replacerepeated", 556 ), //
 Rest( "rest", 557 ), //
 Resultant( "resultant", 558 ), //
 Return( "return", 559 ), //
 Reverse( "reverse", 560 ), //
 Riffle( "riffle", 561 ), //
 RogersTanimotoDissimilarity( "rogerstanimotodissimilarity", 562 ), //
 Root( "root", 563 ), //
 RootIntervals( "rootintervals", 564 ), //
 RootOf( "rootof", 565 ), //
 Roots( "roots", 566 ), //
 RotateLeft( "rotateleft", 567 ), //
 RotateRight( "rotateright", 568 ), //
 Round( "round", 569 ), //
 RowReduce( "rowreduce", 570 ), //
 Rule( "rule", 571 ), //
 RuleDelayed( "ruledelayed", 572 ), //
 RussellRaoDissimilarity( "russellraodissimilarity", 573 ), //
 SameQ( "sameq", 574 ), //
 SatisfiabilityCount( "satisfiabilitycount", 575 ), //
 SatisfiabilityInstances( "satisfiabilityinstances", 576 ), //
 SatisfiableQ( "satisfiableq", 577 ), //
 Scan( "scan", 578 ), //
 Sec( "sec", 579 ), //
 Sech( "sech", 580 ), //
 Second( "second", 581 ), //
 Select( "select", 582 ), //
 Sequence( "sequence", 583 ), //
 Series( "series", 584 ), //
 SeriesCoefficient( "seriescoefficient", 585 ), //
 SeriesData( "seriesdata", 586 ), //
 Set( "set", 587 ), //
 SetAttributes( "setattributes", 588 ), //
 SetDelayed( "setdelayed", 589 ), //
 Share( "share", 590 ), //
 Show( "show", 591 ), //
 Sign( "sign", 592 ), //
 SignCmp( "signcmp", 593 ), //
 Simplify( "simplify", 594 ), //
 Sin( "sin", 595 ), //
 SinIntegral( "sinintegral", 596 ), //
 Sinc( "sinc", 597 ), //
 SingularValueDecomposition( "singularvaluedecomposition", 598 ), //
 Sinh( "sinh", 599 ), //
 SinhIntegral( "sinhintegral", 600 ), //
 Skewness( "skewness", 601 ), //
 Slot( "slot", 602 ), //
 SlotSequence( "slotsequence", 603 ), //
 SokalSneathDissimilarity( "sokalsneathdissimilarity", 604 ), //
 Solve( "solve", 605 ), //
 Sort( "sort", 606 ), //
 Sow( "sow", 607 ), //
 Span( "span", 608 ), //
 Split( "split", 609 ), //
 SplitBy( "splitby", 610 ), //
 Sqrt( "sqrt", 611 ), //
 SquareFreeQ( "squarefreeq", 612 ), //
 SquaredEuclideanDistance( "squaredeuclideandistance", 613 ), //
 StandardDeviation( "standarddeviation", 614 ), //
 Standardize( "standardize", 615 ), //
 StieltjesGamma( "stieltjesgamma", 616 ), //
 StirlingS1( "stirlings1", 617 ), //
 StirlingS2( "stirlings2", 618 ), //
 String( "string", 619 ), //
 StringDrop( "stringdrop", 620 ), //
 StringJoin( "stringjoin", 621 ), //
 StringLength( "stringlength", 622 ), //
 StringTake( "stringtake", 623 ), //
 StruveH( "struveh", 624 ), //
 StruveL( "struvel", 625 ), //
 StudentTDistribution( "studenttdistribution", 626 ), //
 Subfactorial( "subfactorial", 627 ), //
 Subscript( "subscript", 628 ), //
 Subsets( "subsets", 629 ), //
 Subsuperscript( "subsuperscript", 630 ), //
 Subtract( "subtract", 631 ), //
 SubtractFrom( "subtractfrom", 632 ), //
 Sum( "sum", 633 ), //
 Superscript( "superscript", 634 ), //
 Surd( "surd", 635 ), //
 SurfaceGraphics( "surfacegraphics", 636 ), //
 Switch( "switch", 637 ), //
 Symbol( "symbol", 638 ), //
 SymbolName( "symbolname", 639 ), //
 SymbolQ( "symbolq", 640 ), //
 SymmetricMatrixQ( "symmetricmatrixq", 641 ), //
 SyntaxLength( "syntaxlength", 642 ), //
 SyntaxQ( "syntaxq", 643 ), //
 Table( "table", 644 ), //
 Take( "take", 645 ), //
 Tally( "tally", 646 ), //
 Tan( "tan", 647 ), //
 Tanh( "tanh", 648 ), //
 TautologyQ( "tautologyq", 649 ), //
 Taylor( "taylor", 650 ), //
 TeXForm( "texform", 651 ), //
 TensorDimensions( "tensordimensions", 652 ), //
 TensorProduct( "tensorproduct", 653 ), //
 TensorRank( "tensorrank", 654 ), //
 Thread( "thread", 655 ), //
 Through( "through", 656 ), //
 Throw( "throw", 657 ), //
 TimeConstrained( "timeconstrained", 658 ), //
 Times( "times", 659 ), //
 TimesBy( "timesby", 660 ), //
 Timing( "timing", 661 ), //
 ToCharacterCode( "tocharactercode", 662 ), //
 ToPolarCoordinates( "topolarcoordinates", 663 ), //
 ToRadicals( "toradicals", 664 ), //
 ToString( "tostring", 665 ), //
 ToUnicode( "tounicode", 666 ), //
 ToeplitzMatrix( "toeplitzmatrix", 667 ), //
 Together( "together", 668 ), //
 TooLarge( "toolarge", 669 ), //
 Total( "total", 670 ), //
 Tr( "tr", 671 ), //
 Trace( "trace", 672 ), //
 Transpose( "transpose", 673 ), //
 Trig( "trig", 674 ), //
 TrigExpand( "trigexpand", 675 ), //
 TrigReduce( "trigreduce", 676 ), //
 TrigToExp( "trigtoexp", 677 ), //
 True( "true", 678 ), //
 TrueQ( "trueq", 679 ), //
 Tuples( "tuples", 680 ), //
 Unequal( "unequal", 681 ), //
 Unevaluated( "unevaluated", 682 ), //
 Union( "union", 683 ), //
 Unique( "unique", 684 ), //
 UnitStep( "unitstep", 685 ), //
 UnitVector( "unitvector", 686 ), //
 UnitaryMatrixQ( "unitarymatrixq", 687 ), //
 Unitize( "unitize", 688 ), //
 Unknown( "unknown", 689 ), //
 UnsameQ( "unsameq", 690 ), //
 Unset( "unset", 691 ), //
 UpSet( "upset", 692 ), //
 UpSetDelayed( "upsetdelayed", 693 ), //
 UpperCaseQ( "uppercaseq", 694 ), //
 UpperTriangularize( "uppertriangularize", 695 ), //
 ValueQ( "valueq", 696 ), //
 VandermondeMatrix( "vandermondematrix", 697 ), //
 Variable( "variable", 698 ), //
 Variables( "variables", 699 ), //
 Variance( "variance", 700 ), //
 VectorAngle( "vectorangle", 701 ), //
 VectorQ( "vectorq", 702 ), //
 WeibullDistribution( "weibulldistribution", 703 ), //
 Which( "which", 704 ), //
 While( "while", 705 ), //
 White( "white", 706 ), //
 With( "with", 707 ), //
 Xor( "xor", 708 ), //
 YuleDissimilarity( "yuledissimilarity", 709 ), //
 Zeta( "zeta", 710 );

	private final String name;
	private final int symbolID;
	private final static IBuiltInSymbol[] builtInSymbols = new IBuiltInSymbol[values().length];

	public static IBuiltInSymbol valueOf(BuiltIns sEnum) {
		IBuiltInSymbol symbol = F.initFinalSymbol(sEnum);
		builtInSymbols[sEnum.symbolID] = symbol;
		return symbol;
	}

	BuiltIns(String name, int symbolID) {
		this.name = name;
		this.symbolID = symbolID;
	}

	public static IBuiltInSymbol symbol(int id) {
		return builtInSymbols[id];
	}

	public final int id() {
		return symbolID;
	}

	public final String str() {
		return name;
	}
}