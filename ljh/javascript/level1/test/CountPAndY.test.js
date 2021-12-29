import CountPAndY from '../CountPAndY';
test(`문자열 내의 P와 Y의 개수`, () => {
    expect(new CountPAndY().solution("pPoooyY")).toBeTruthy();
    expect(new CountPAndY().solution("Pyy")).toBeFalsy();
});