// n^2 배열 자르기(220122-220128)
export default class SliceNSquaredArray {
    solution = (n, left, right) => {
        let answer = [];
        let length = right-left+1;
        let row = 0;
        let col = 0;
        
        while(left <= right){
            row = Math.floor(left/n) + 1;
            col = Math.floor(left%n) + 1;
            
            answer.push(row > col ? row : col);
            
            left++;
        }
        
        return answer;
    }
}