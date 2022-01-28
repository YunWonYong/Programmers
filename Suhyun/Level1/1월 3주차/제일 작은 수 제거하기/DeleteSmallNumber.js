let arr = [4,3,2,1];
let answer=[];

if(arr.length==1){
    answer[0]=-1;
    return answer;
}
// 미리 최솟값 구하기 
const min =Math.min(...arr);
//filter로 걸러서 min빼고 answer 쪽으로 
answer=arr.filter(e => e !== min);
console.log(answer);
//return answer.filter(e => e !== min);

//return answer=arr.filter((e) =>e!==Math.min.apply(null,arr));




