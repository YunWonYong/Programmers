package level2.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
	{ 
		FebruaryWeekOf2.class,	FebruaryWeekOf3.class,	FebruaryWeekOf4.class,
		MarchWeekOf1.class,		MarchWeekOf2.class,		MarchWeekOf3.class	
	}
)
public class AllTests {}
