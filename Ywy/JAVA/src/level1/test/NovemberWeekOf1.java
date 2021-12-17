package level1.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.KthPlayerTest;
import level1.test.cases.MakePrimeNumberTest;
import level1.test.cases.UnfinishedPlayerTest;

@RunWith(Suite.class)
@SuiteClasses({MakePrimeNumberTest.class, UnfinishedPlayerTest.class, KthPlayerTest.class})
public class NovemberWeekOf1 {
	@AfterClass
	public static void clear() {
		System.gc();
	}
}
