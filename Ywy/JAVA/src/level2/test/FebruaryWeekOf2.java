package level2.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import level2.test.cases.OpenChatRoomTest;
import level2.test.cases.StringCompressionTest;

@RunWith(Suite.class)
@SuiteClasses({ StringCompressionTest.class, OpenChatRoomTest.class })
public class FebruaryWeekOf2 {

}
