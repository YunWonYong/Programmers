package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.DivisibleNumberTest;
import level1.test.cases.HateSameNumberTest;
import level1.test.cases.TwoNumberPlusTest;

@RunWith(Suite.class)
@SuiteClasses({ HateSameNumberTest.class, DivisibleNumberTest.class, TwoNumberPlusTest.class })
public class DecemberWeekOf2 {

}
