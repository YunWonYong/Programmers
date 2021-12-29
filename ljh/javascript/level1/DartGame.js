export default class DartGame {
    solution = (dartResult) => {
        let answer = 0; // 합계
        let num; // 현재 숫자
        let num2 = 0; // 에러 방지
        let arr = []; // 숫자 저장 배열
        let index = 0; //배열 인덱스
        let isNumber = false;  //이전 문자가 숫자인가? 아닌가?
    
        for(let char of dartResult) {
            if(char >= '0' && char <= '9'){
                // 숫자일 때
                if(isNumber === true){
                    num = 10;
                    num2 = 10;
                    continue;
                }
                    num = char;
                    num2 = char;
                    isNumber = true;
            }else{
                // 문자일 때
                isNumber = false;
                switch(char){
                    case 'T':
                        num2 = num2*num2;
                    case 'D':
                        num = num2*num;
                    case 'S':
                        arr.push(num);
                        index++;
                        break;
                    case '#':
                        arr[index-1] *=-1;
                        break;
                    default:
                        if(index>=2){
                            arr[index-2] *= 2;
                        }
                        arr[index-1] *= 2;
                        break;
                }
            }   
        }
        for(let i of arr){
            answer = answer + (+i);
        }
        return answer;
    }
}
