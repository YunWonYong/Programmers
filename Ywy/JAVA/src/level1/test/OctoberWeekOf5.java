package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level1.test.cases.AddMissingNumberTest;
import level1.test.cases.InnerProductTest;
import level1.test.cases.NegativeAndPositiveNumbersPlusTest;

@RunWith(Suite.class)
@SuiteClasses({AddMissingNumberTest.class, NegativeAndPositiveNumbersPlusTest.class, InnerProductTest.class})
public class OctoberWeekOf5 {
}
