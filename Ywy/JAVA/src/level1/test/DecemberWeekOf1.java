package level1.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.DartsGameTest;
import level1.test.cases.GetMiddleLetterTest;
import level1.test.cases.SecretMapTest;

@RunWith(Suite.class)
@SuiteClasses({ SecretMapTest.class, GetMiddleLetterTest.class, DartsGameTest.class })
public class DecemberWeekOf1 {
	@AfterClass
	public static void clear() {
		System.out.println((int)'z');
		System.gc();
	}
}
