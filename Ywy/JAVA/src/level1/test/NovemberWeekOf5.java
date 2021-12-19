package level1.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.FindRemainderNumeric1Test;
import level1.test.cases.InsufficientAmountTest;
import level1.test.cases.MinimumRectangleTest;

@RunWith(Suite.class)
@SuiteClasses({ MinimumRectangleTest.class, FindRemainderNumeric1Test.class, InsufficientAmountTest.class })
public class NovemberWeekOf5 {
	@AfterClass
	public static void clear() {
		System.gc();
	}
}
