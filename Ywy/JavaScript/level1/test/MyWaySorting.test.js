import MyWaySorting from '../MyWaySorting';
test('["sun", "bed", "car"] -> ["car", "bed", "sun"]', () => {
    expect(new MyWaySorting().solution(["sun", "bed", "car"], 1)).toEqual(expect.arrayContaining(["car", "bed", "sun"]));
});

test('["abce", "abcd", "cdx"] -> ["abcd", "abce", "cdx"]', () => {
    expect(new MyWaySorting().solution(["abce", "abcd", "cdx"], 2)).toEqual(expect.arrayContaining(["abcd", "abce", "cdx"]));
});