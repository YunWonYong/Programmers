// 자연수 뒤집어 배열로 만들기 (220108 - 220114)
// solution2 > solution3 > solution1
export default class ReverseNumber {
    solution1 = (n) => {
        const arr = [];
        [...n+""].forEach(v =>arr.unshift(+v));
        return arr;
    }

    solution2 = (n) => {
        const arr = [];
        while(n > 0){
            arr.push(n % 10);
            n = Math.floor(n/10);
        }
        return arr;
    }

    solution3 = (n) => {
        const arr = [];
        const numberArr = [...n+""];
        for(let i=numberArr.length-1; i>=0; i--) arr.push(+numberArr[i]); 
        return arr;
    }
}