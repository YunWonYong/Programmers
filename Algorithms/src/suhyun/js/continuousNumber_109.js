// 정확성은 통과했으나 효율성 테스트에서 실패 
function solution(arr)
{
    var answer = [];
    let count = 0;
    let length = arr.length;
    for (let i = 0; i < length; i++) { 
        // 배열에서 같은 원소가 있으면 삭제
        if (arr[count] == arr[count + 1]) {
          arr.splice(count, 1);
          // 배열에서 원소를 삭제하는 것은 효율성에서 문제가 생김 
          // 아래 코드처럼 삭제보다는 연속되지 않는 걸 추가 시키는 것이 효율성이 좋다 
        }
        else {
            count++;
        }
    }   
    var answer = [...arr];
    return answer;
}

// 효율성 테스트를 통과한 다른 사람의 코드
function solution(arr)
{
    var answer = [];
    for (let i = 0; i < arr.length; i++) {
      //원소가 같지 않으면 해당 원소를 answer배열에 추가 
      if (arr[i] != arr[i + 1]) {
        answer.push(arr[i]);
        }
      }
      return answer;
}
