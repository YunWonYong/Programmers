import PrimeNumberFind from '../PrimeNumberFind';

test('10 -> 4', () => {
    expect(new PrimeNumberFind().solution(10)).toBe(4);
});

test('5 -> 3', () => {
    expect(new PrimeNumberFind().solution(5)).toBe(3);
});