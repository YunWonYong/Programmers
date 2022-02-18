import Nara1234 from '../Nara1234';

test(`4 is 11`, () => {
    expect(new Nara1234().solution(4)).toBe("11");
});

test(`12 is 44`, () => {
    expect(new Nara1234().solution(12)).toBe("44");
});