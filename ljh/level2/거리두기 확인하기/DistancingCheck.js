// 거리두기 확인하기

function solution(places) {
    const answer = [];
    places.forEach((v) => answer.push(CheckDistaning(v)? 1 : 0));
    return answer;
}

function CheckDistaning(arr) { 
    const searchP = Array.from(Array(5), () => Array(5).fill(0));    
    for (let i = 0; i < 5; i++) {
        for (let j = 0; j < 5; j++) {
            if(arr[i][j] === 'P') {
                searchP[i][j] += 1;
                if(i - 1 >= 0) 
                    searchP[i-1][j] += 1;
                if(i + 1 < 5) 
                    searchP[i+1][j] += 1;
                if(j - 1 >= 0) 
                    searchP[i][j-1] += 1;
                if(j + 1 < 5) 
                    searchP[i][j+1] += 1;
            }
        }
    }
    
    for (let i = 0; i < 5; i++) {
        for (let j = 0; j < 5; j++) {
            if(searchP[i][j] > 1 && arr[i][j] != 'X') {
                return false;
            }
        }
    }
    
    return true;
}