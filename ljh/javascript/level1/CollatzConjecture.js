// 콜라츠 추측 (220122-220128)
export default class CollatzConjecture {
    solution = (n) => {
        let count = 0;
        collatz(n);
        return count>500? -1 : count;

        function collatz(n){
            if(n === 1) return ;
            count++;
            n%2 == 0? collatz(n/2) : collatz(n*3 + 1);
        }
    }
}