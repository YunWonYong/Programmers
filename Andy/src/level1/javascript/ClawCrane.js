// 크레인 인형뽑기 게임
function solution(board, moves) {
    var answer = 0;
    var arr = Array();
    board.pickup = function(idx) {
        for(let i=0;i<board.length;i++) {
            if(this[i][idx]>0) {
                let tmp = this[i][idx];
                this[i][idx] = 0;
                return tmp;
            }
        }
        return 0;
    }

	moves.forEach(function(item) {
		item--;
        let data = board.pickup(item);
        if(data)  {
            if(arr.length && arr[arr.length-1] == data) {
                arr.pop();
                answer += 2;
            }
            else 
                arr.push(data);
        }
	});
    return answer;    
  
}