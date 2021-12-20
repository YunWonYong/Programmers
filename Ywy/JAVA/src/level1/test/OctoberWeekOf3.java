package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.LottoRankingsTest;
import level1.test.cases.RecommendNewIdTest;

@RunWith(Suite.class)
@SuiteClasses({ LottoRankingsTest.class, RecommendNewIdTest.class })
public class OctoberWeekOf3 {
}
