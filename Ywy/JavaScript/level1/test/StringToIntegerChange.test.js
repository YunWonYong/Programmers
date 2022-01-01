import StringToIntegerChange from '../StringToIntegerChange';

test('"-1234" is -1234', () => {
    expect(new StringToIntegerChange().solution("-1234")).toBe(-1234);
});
