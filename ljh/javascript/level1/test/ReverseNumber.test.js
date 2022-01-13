import ReverseNumber from '../ReverseNumber';
test(`자연수 뒤집어 배열로 만들기`, () => {
    expect(new ReverseNumber().solution1(12345)).toEqual([5,4,3,2,1]);
})

test(`자연수 뒤집어 배열로 만들기2`, () => {
    expect(new ReverseNumber().solution2(12345)).toEqual([5,4,3,2,1]);
})

test(`자연수 뒤집어 배열로 만들기3`, () => {
    expect(new ReverseNumber().solution3(12345)).toEqual([5,4,3,2,1]);
})