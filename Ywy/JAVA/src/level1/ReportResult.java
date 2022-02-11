package level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class ReportFactory {
	protected String[] users;
	public static final ReportFactory createFactory(String[] user_list, String[] report, int k) {
		return new BadUserReportAnalyzer(report, k).setUsers(user_list);
	}
	
	public final int[] getResponseReportCounts() {
		int index = 0;
		int range = users.length;
		int[] result = new int[range];
		while (true) {
			result[index] = reportRequestCount(users[index++]);
			if (index == range) {
				return result;
			}
		}
	}
	
	protected final ReportFactory setUsers(String[] userArr) {
		this.users = userArr;
		return this;
	}

	public abstract ReportFactory requestReportAnalysis();
	protected abstract int reportRequestCount(String user);
}

final class BadUserReportAnalyzer extends ReportFactory{
	private final String[] REPORT_INFO;
	private final Map<String, List<String>> REPORT_TABLE;
	private final List<String> SUSPENSION_USERS = new ArrayList<>();
	private final int REPORT_LIMIT;
	public BadUserReportAnalyzer(String[] report, int k) {
		super();
		REPORT_INFO = report;
		REPORT_LIMIT = k;
		REPORT_TABLE = new HashMap<>();
	}

	@Override
	public ReportFactory requestReportAnalysis() {;
		Map<String, Integer> badUserReportInfo = new HashMap<>();
		String[] report = null;
		int index = 0;
		int range = REPORT_INFO.length;
		String reporter = null;
		String reported = null;
		List<String> reportedList = null;
		while (index < range) {
			report = REPORT_INFO[index++].split(" ");
			reporter = report[0];
			reported = report[1];
			reportedList = REPORT_TABLE.get(reporter);
			reportedList = reportedList == null ? new ArrayList<>() : reportedList;
			if (reportedList.indexOf(reported) > -1) {
				continue;
			}
			reportedList.add(reported);
			REPORT_TABLE.put(reporter, reportedList);
			badUserReportInfo.put(reported, badUserReportInfo.getOrDefault(reported, 0) + 1);
			if (badUserReportInfo.get(reported) >= REPORT_LIMIT && SUSPENSION_USERS.indexOf(reported) == -1) {
				SUSPENSION_USERS.add(reported);
			}
		}
		return this;
	}
	

	@Override
	protected int reportRequestCount(String user) {
		List<String> reportedList = REPORT_TABLE.get(user);
		if (reportedList == null) {
			return 0;
		}
		int count = 0;
		for (String reported: reportedList) {
			if (SUSPENSION_USERS.indexOf(reported) == -1) {
				continue;
			}
			count++;
		}
		return count;
	}
}

public class ReportResult {
	public int[] solution(String[] user_list, String[] report, int k) {
		return ReportFactory.createFactory(user_list, report, k).requestReportAnalysis().getResponseReportCounts();
	}
}
