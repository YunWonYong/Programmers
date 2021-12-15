package ywy.java.level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ywy.java.level1.test.cases.DiviserCountPlusTest;
import ywy.java.level1.test.cases.FailureRateTest;
import ywy.java.level1.test.cases.TernaryFlipTest;

@RunWith(Suite.class)
@SuiteClasses({ FailureRateTest.class, DiviserCountPlusTest .class, TernaryFlipTest.class })
public class NovemberWeekOf3 {
}
