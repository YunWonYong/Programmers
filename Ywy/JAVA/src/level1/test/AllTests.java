package level1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
	{ 
		OctoberWeekOf3.class, 	OctoberWeekOf4.class, 	OctoberWeekOf5.class,
		NovemberWeekOf1.class, 	NovemberWeekOf2.class, 	NovemberWeekOf3.class, 	NovemberWeekOf4.class, 	NovemberWeekOf5.class, 
		DecemberWeekOf1.class, 	DecemberWeekOf2.class,  DecemberWeekOf3.class
	}
)
public class AllTests {

}
