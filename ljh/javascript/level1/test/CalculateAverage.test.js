import CalculateAverage from '../CalculateAverage';
test(`평균 구하기`, ()=>{
    expect(new CalculateAverage().solution([1,2,3,4])).toEqual(2.5);
})

test(`평균 구하기`, ()=>{
    expect(new CalculateAverage().solution([5,5])).toEqual(5);
})