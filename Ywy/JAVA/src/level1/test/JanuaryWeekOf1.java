package level1.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.CaesarCipherTest;
import level1.test.cases.InfinityWatermelonTest;
import level1.test.cases.StringToIntegerChangeTest;
@RunWith(Suite.class)
@SuiteClasses({ InfinityWatermelonTest.class, StringToIntegerChangeTest.class, CaesarCipherTest.class })
public class JanuaryWeekOf1 {
}
