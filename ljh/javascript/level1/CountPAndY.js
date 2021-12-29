// 문자열 내의 P와 Y의 개수 (12/18 - 12/24)
export default class CountPAndY{
   solution = (s) => {
        s = s.toLowerCase();
        let count = 0;
        
        for (let c of s){
            if(c === 'p') count++;
            if(c === 'y') count--;
        }
        return count === 0? true : false;
    }
}