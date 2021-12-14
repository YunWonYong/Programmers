function solution(a, b) {
    var answer = 0;
    // 합이니까 그냥 a를 항상 작게 만들어주고 a와 b사이 값만 추출하는게 더 편할듯
    if (b <= a) {
    let temp = a;
    a = b;
    b = temp;
    }
 
    for(let i = a; i <= b; i++) { 
      answer = answer + i;
    }
    
    return answer;
}
