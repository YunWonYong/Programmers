package ywy.java.level1.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ywy.java.level1.test.cases.LottoRankingsTest;
import ywy.java.level1.test.cases.RecommendNewIdTest;

@RunWith(Suite.class)
@SuiteClasses({ LottoRankingsTest.class, RecommendNewIdTest.class })
public class OctoberWeekOf3 {
	@AfterClass
	public static void clear() {
		System.gc();
	}
}
