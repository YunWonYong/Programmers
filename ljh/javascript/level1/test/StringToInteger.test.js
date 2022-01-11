import StringToInteger from '../StringToInteger'
test(`문자열을 정수로 바꾸기`,()=>{
    expect(new StringToInteger().solution("1234")).toBe(1234);
});
test(`문자열을 정수로 바꾸기`,()=>{
    expect(new StringToInteger().solution("-1234")).toBe(-1234);
});

test(`문자열을 정수로 바꾸기2`,()=>{
    expect(new StringToInteger().solution2("1234")).toBe(1234);
});
test(`문자열을 정수로 바꾸기2`,()=>{
    expect(new StringToInteger().solution2("-1234")).toBe(-1234);
});