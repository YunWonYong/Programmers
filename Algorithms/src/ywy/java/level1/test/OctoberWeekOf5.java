package ywy.java.level1.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ywy.java.level1.test.cases.AddMissingNumberTest;
import ywy.java.level1.test.cases.InnerProductTest;
import ywy.java.level1.test.cases.NegativeAndPositiveNumbersPlusTest;

@RunWith(Suite.class)
@SuiteClasses({AddMissingNumberTest.class, NegativeAndPositiveNumbersPlusTest.class, InnerProductTest.class})
public class OctoberWeekOf5 {
	@AfterClass
	public static void clear() {
		System.gc();
	}
}
