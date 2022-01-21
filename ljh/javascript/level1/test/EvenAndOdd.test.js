import EvenAndOdd from '../EvenAndOdd';
test(`짝수와 홀수`, () => {
    expect(new EvenAndOdd().solution(3)).toEqual('Odd');
})
test(`짝수와 홀수`, () => {
    expect(new EvenAndOdd().solution(4)).toEqual('Even');
})