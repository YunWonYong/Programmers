import SortInDescendingOrder from '../SortInDescendingOrder';
test(`문자열 내림차순으로 정렬하기`, () => {
    expect(new SortInDescendingOrder().solution("Zbcdefg")).toEqual("gfedcbZ");
});