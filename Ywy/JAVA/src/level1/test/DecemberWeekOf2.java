package level1.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.HateSameNumberTest;

@RunWith(Suite.class)
@SuiteClasses({ HateSameNumberTest.class  })
public class DecemberWeekOf2 {
	@AfterClass
	public static void clear() {
		System.gc();
	}
}
