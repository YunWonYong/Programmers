package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.BudgetTest;
import level1.test.cases.DiviserCountPlusTest;
import level1.test.cases.Year2016Test;

@RunWith(Suite.class)
@SuiteClasses({ BudgetTest.class, DiviserCountPlusTest .class, Year2016Test.class })
public class NovemberWeekOf4 {
}
