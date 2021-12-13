package ywy.java.level1.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ywy.java.level1.test.cases.KthPlayerTest;
import ywy.java.level1.test.cases.MakePrimeNumberTest;
import ywy.java.level1.test.cases.UnfinishedPlayerTest;

@RunWith(Suite.class)
@SuiteClasses({MakePrimeNumberTest.class, UnfinishedPlayerTest.class, KthPlayerTest.class})
public class NovemberWeekOf1 {
	@AfterClass
	public static void clear() {
		System.gc();
	}
}
