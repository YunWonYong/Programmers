let num=6;
let answer=0;

while(answer!=500){
    if(num==1) return answer;
    
    num%2==0 ? num=num/2 : num=num*3+1;
    answer++;
    
}
return -1;
