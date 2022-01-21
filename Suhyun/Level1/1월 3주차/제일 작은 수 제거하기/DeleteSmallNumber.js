let arr = [4,3,2,1];
let answer=[];

if(arr.length==1){
    answer[0]=-1;
    return answer;
}

return answer=arr.filter((e) =>e!==Math.min.apply(null,arr));




