// 프로그래머스 Level 1,최소직사각형
function solution(sizes) {
    var func = { };
    func.sz = 1000000;    
    var arrx = [];
    var arry = [];
    sizes.forEach( (d) => {
        arrx.push(Math.max(d[0],d[1]));
        arry.push(Math.min(d[0],d[1]));
    });
    
    return Math.max(...arrx) * Math.max(...arry);
}