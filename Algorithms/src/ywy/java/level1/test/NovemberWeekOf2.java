package ywy.java.level1.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ywy.java.level1.test.cases.GymSuitTest;
import ywy.java.level1.test.cases.MockExamTest;
import ywy.java.level1.test.cases.PokemonTest;

@RunWith(Suite.class)
@SuiteClasses({MockExamTest.class, GymSuitTest.class, PokemonTest.class})
public class NovemberWeekOf2 {
	@AfterClass
	public static void clear() {
		System.gc();
	}
}
