package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.FromSeoulKimGroomFindTest;
import level1.test.cases.PrimeNumberFindTest;
import level1.test.cases.StringHandlingBasicsTest;

@RunWith(Suite.class)
@SuiteClasses({ StringHandlingBasicsTest.class, FromSeoulKimGroomFindTest.class, PrimeNumberFindTest.class })
public class DecemberWeekOf4 {
}
