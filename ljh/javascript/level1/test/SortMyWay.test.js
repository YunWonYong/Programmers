import SortMyWay from '../SortMyWay';
test(`문자열 내 마음대로 정렬하기`, () => {
    expect(new SortMyWay().solution(["sun", "bed", "car"], 1)).toEqual(expect.arrayContaining(["car", "bed", "sun"]));
    expect(new SortMyWay().solution(["abce", "abcd", "cdx"], 2)).toEqual(expect.arrayContaining(["abcd", "abce", "cdx"]));
});