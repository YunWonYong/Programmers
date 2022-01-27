package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.ArrayNSqrt2SplitTest;
import level1.test.cases.AverageTest;
import level1.test.cases.ColatzGuessTest;
import level1.test.cases.GcdAndLcmTest;
import level1.test.cases.HarshadNumberTest;

@RunWith(Suite.class)
@SuiteClasses({ ArrayNSqrt2SplitTest.class, AverageTest.class, ColatzGuessTest.class, GcdAndLcmTest.class, HarshadNumberTest.class })
public class JanuaryWeekOf4 {
}
