package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.FromSeoulKimGroomFindTest;
import level1.test.cases.MyWaySortingTest;
import level1.test.cases.PAndYCountTest;
import level1.test.cases.StringDescendingTest;

@RunWith(Suite.class)
@SuiteClasses({ PAndYCountTest.class, FromSeoulKimGroomFindTest.class, StringDescendingTest.class })
public class DecemberWeekOf4 {
}
