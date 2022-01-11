import SubakSubak from '../SubakSubak';
test(`수박수박수박수박수박수?`,()=>{
    expect(new SubakSubak().solution(3)).toEqual("수박수");
});
test(`수박수박수박수박수박수?`,()=>{
    expect(new SubakSubak().solution(4)).toEqual("수박수박");
});