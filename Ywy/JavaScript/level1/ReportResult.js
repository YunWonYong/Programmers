export default class ReportResult {
    solution = (id_list, report, k) => {
        const reportInfo = {};
        const reportCountInfo = {};
        const reportObj = {};
        const answer = [];

        id_list.forEach(id => {
            reportInfo[id] = [];
            reportCountInfo[id] = 0;
        });

        report.forEach(txt => {
            let [reporter, reported] = txt.split(" ");
            if (reportInfo[reporter].indexOf(reported) === -1) {
                reportInfo[reporter].push(reported);
                reportCountInfo[reported]++;
            }

            if (reportCountInfo[reported] >= k && !reportObj[reported]) {
                reportObj[reported] = reported;
            }
        });

        Object.keys(reportInfo).forEach((id, index) => {
            const info = reportInfo[id];
            const range = info.length;
            let count = 0;
            if (range) {
                info.forEach(reported => {
                    if (reportObj[reported]) {
                        count++;
                    }
                });
            }
            answer[index] = count;
        });
        return answer;
    };
}