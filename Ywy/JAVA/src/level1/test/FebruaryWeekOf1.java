package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.MatrixSumTest;
import level1.test.cases.NNumbersSpacedByXTest;
import level1.test.cases.PhoneNumberMaskingTest;

@RunWith(Suite.class)
@SuiteClasses({ PhoneNumberMaskingTest.class, MatrixSumTest.class, NNumbersSpacedByXTest.class })
public class FebruaryWeekOf1 {

}
