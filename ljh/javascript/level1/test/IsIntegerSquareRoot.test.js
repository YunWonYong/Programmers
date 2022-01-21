import IsIntegerSquareRoot from '../IsIntegerSquareRoot';
test(`정수 제곱근 판별`, () =>{
    expect(new IsIntegerSquareRoot().solution(121)).toBe(144);
}) 
test(`정수 제곱근 판별`, () =>{
    expect(new IsIntegerSquareRoot().solution(3)).toBe(-1);
}) 
