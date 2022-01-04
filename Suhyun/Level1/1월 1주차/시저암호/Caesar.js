function solution(s, n) {

    let arr=s.split("").map(ch => ch.charCodeAt());
    let flag=true;

    for(let i=0; i<arr.length; i++){
        if(arr[i]==32) {
            continue;
        }
        else if(arr[i]<=90){
            flag=false;
        }
        
        arr[i]=arr[i]+n;
        if(flag){
            if(arr[i]>122){
                arr[i]=arr[i]-26;
            }
        }
        else{
            if(arr[i]>90){
                arr[i]=arr[i]-26;
            }
        }
        flag=true
    }
    let answer=arr.map(ch=>String.fromCharCode(ch)).join("");
    //console.log(answer);
    return answer;
}

