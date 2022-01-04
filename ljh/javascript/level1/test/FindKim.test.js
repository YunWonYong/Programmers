import FindKim from '../FindKim';

test(`서울에서 김서방 찾기`, () => {
    expect(new FindKim().solution(["Jane","Kim"])).toEqual("김서방은 1에 있다");
});