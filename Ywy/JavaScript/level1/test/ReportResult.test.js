import ReportResult from '../ReportResult';

test(`
["muzi", "frodo", "apeach", "neo"], ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2 is [2,1,1,0]
`, () => {
    expect(new ReportResult().solution(["muzi", "frodo", "apeach", "neo"], ["muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"], 2)).toEqual([2, 1, 1, 0]);
});
