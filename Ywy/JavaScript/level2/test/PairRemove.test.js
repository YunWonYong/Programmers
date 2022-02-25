import PairRemove from '../PairRemove';

test('"baabaa" is 1', () => {
    expect(new PairRemove().solution("baabaa")).toBe(1);
});

test('"cdcd" is 0', () => {
    expect(new PairRemove().solution("cdcd")).toBe(0);
});
