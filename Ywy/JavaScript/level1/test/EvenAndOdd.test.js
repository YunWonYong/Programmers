import EvenAndOdd from '../EvenAndOdd';

test('2 is "Even"', () => {
    expect(new EvenAndOdd().solution(2)).toEqual("Even");
});

test('1 is Odd', () => {
    expect(new EvenAndOdd().solution(1)).toEqual("Odd");
});