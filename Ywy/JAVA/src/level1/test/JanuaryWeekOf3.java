package level1.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.EvenAndOddTest;
import level1.test.cases.MinNumberRemoveTest;
import level1.test.cases.NumberDescSortTest;
import level1.test.cases.NumberSquareRootDiscriminationTest;
@RunWith(Suite.class)
@SuiteClasses({ NumberSquareRootDiscriminationTest.class, MinNumberRemoveTest.class, NumberDescSortTest.class, EvenAndOddTest.class })
public class JanuaryWeekOf3 {
}
