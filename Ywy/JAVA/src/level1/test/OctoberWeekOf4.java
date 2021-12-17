package level1.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.ClawCraneTest;
import level1.test.cases.KeyPadPressTest;
import level1.test.cases.NumberStrToNumberTest;

@RunWith(Suite.class)
@SuiteClasses({ ClawCraneTest.class, KeyPadPressTest.class, NumberStrToNumberTest.class })
public class OctoberWeekOf4 {
	@AfterClass
	public static void clear() {
		System.gc();
	}
}
