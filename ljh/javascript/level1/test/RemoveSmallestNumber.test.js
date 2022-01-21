import RemoveSmallestNumber from '../RemoveSmallestNumber';
test(`제일 작은 수 제거하기`, ()=>{
    expect(new RemoveSmallestNumber().solution([4,3,2,1])).toEqual([4,3,2]);
})

test(`제일 작은 수 제거하기`, ()=>{
    expect(new RemoveSmallestNumber().solution([10])).toEqual([-1]);
})