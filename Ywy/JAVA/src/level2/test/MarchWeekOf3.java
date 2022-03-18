package level2.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level2.test.cases.CheckDistanceTest;
import level2.test.cases.NewsClusteringTest;

@RunWith(Suite.class)
@SuiteClasses({ NewsClusteringTest.class, CheckDistanceTest.class })
public class MarchWeekOf3 {

}
