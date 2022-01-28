import GCDandLCM from '../GCDandLCM';
test(`최대공약수와 최소공배수`, () =>{
    expect(new GCDandLCM().solution(3,12)).toEqual([3,12])
});

test(`최대공약수와 최소공배수`, () =>{
    expect(new GCDandLCM().solution(2,5)).toEqual([1,10])
});