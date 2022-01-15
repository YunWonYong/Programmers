import Arrange from '../ArrangeIntegerInDescendingOrder';
test(`정수 내림차순으로 배치하기`,()=>{
    expect(new Arrange().solution(118372)).toBe(873211);
});