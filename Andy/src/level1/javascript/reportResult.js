//프로그래머스 Level 1,신고 결과 받기
function solution(id_list, report, k) {
    var answer = [];
    var ulist = [];
    var rlist = [];
    var block_list = [];
    
    
    id_list.forEach( (d) => {
        ulist[d] = new Set();
        rlist[d] = new Set();
        block_list[d] = 0;
    });
    
    report.forEach( (d) => {
        let [x,y] = d.split(" ");
        ulist[x].add(y);
        rlist[y].add(x);
    });
       
    for (let d in rlist) {
        if(rlist[d].size >= k)
            block_list[d] = 1;
    }    
    
    id_list.forEach( (d) => {
        let cnt = 0;
        ulist[d].forEach( (d) => {
            if(block_list[d]>0) cnt++;
        });
        answer.push(cnt);
    });
    
    return answer;
}