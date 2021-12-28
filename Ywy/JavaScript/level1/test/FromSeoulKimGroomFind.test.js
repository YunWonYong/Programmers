import FromSeoulKimGroomFind from '../FromSeoulKimGroomFind';
test('["Jane", "Kim"] -> "김서방은 1에 있다"', () => {
    expect(new FromSeoulKimGroomFind().solution(["Jane", "Kim"])).toEqual("김서방은 1에 있다");
});