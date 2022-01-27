import SliceNSquaredArray from '../SliceNSquaredArray';
test(`n^2 배열 자르기`, ()=>{
    expect(new SliceNSquaredArray().solution(3,2,5)).toEqual([3,2,2,3]);
});
test(`n^2 배열 자르기`, ()=>{
    expect(new SliceNSquaredArray().solution(4,7,14)).toEqual([4,3,3,3,4,4,4,4]);
});
