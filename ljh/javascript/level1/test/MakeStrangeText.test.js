import MakeStrangeText from '../MakeStrangeText';
test(`이상한 문자 만들기`, () => {
    expect(new MakeStrangeText().solution("try hello world")).toEqual("TrY HeLlO WoRlD");
});