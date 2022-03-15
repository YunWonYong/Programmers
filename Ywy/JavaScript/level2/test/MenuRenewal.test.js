import MenuRenewal from '../MenuRenewal';

test(`["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"], [2,3,4] is ["AC", "ACDE", "BCFG", "CDE"]`, () => {
    expect(new MenuRenewal().solution(["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"], [2, 3, 4])).toEqual(["AC", "ACDE", "BCFG", "CDE"]);
});