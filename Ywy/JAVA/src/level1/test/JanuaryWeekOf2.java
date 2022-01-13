package level1.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.AddDigitsTest;
import level1.test.cases.ArrayByFlippingNumbersTest;
import level1.test.cases.SumOfFactorsTest;
import level1.test.cases.WeirdStringMakeTest;
@RunWith(Suite.class)
@SuiteClasses({ SumOfFactorsTest.class, WeirdStringMakeTest.class, AddDigitsTest.class, ArrayByFlippingNumbersTest.class })
public class JanuaryWeekOf2 {
}
