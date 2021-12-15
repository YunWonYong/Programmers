package ywy.java.level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ywy.java.level1.test.cases.DivisibleNumberTest;
import ywy.java.level1.test.cases.HateSameNumberTest;
import ywy.java.level1.test.cases.SumBetweenTwoNumbersTest;

@RunWith(Suite.class)
@SuiteClasses({ HateSameNumberTest.class, DivisibleNumberTest.class, SumBetweenTwoNumbersTest.class})
public class DecemberWeekOf2 {
}
