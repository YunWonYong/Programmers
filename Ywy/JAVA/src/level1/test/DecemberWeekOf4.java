package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.FromSeoulKimGroomFindTest;
import level1.test.cases.PAndYCountTest;
import level1.test.cases.PrimeNumberFindTest;

@RunWith(Suite.class)
@SuiteClasses({ PAndYCountTest.class, FromSeoulKimGroomFindTest.class, PrimeNumberFindTest.class })
public class DecemberWeekOf4 {
}
