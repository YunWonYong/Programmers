package ywy.java.level1.test;

import org.junit.AfterClass;
import ywy.java.level1.test.cases.HateSameNumberTest;

@RunWith(Suite.class)
@SuiteClasses({ HateSameNumberTest.class  })
public class DecemberWeekOf2 {
	@AfterClass
	public static void clear() {
		System.gc();
	}
}
