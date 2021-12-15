package ywy.java.level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ywy.java.level1.test.cases.DartsGameTest;
import ywy.java.level1.test.cases.GetMiddleLetterTest;
import ywy.java.level1.test.cases.SecretMapTest;

@RunWith(Suite.class)
@SuiteClasses({ SecretMapTest.class, GetMiddleLetterTest.class, DartsGameTest.class })
public class DecemberWeekOf1 {
}
