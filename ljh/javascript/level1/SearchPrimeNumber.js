// 소수 찾기 (211224 - 211230)
export default class {
    

    solution = (n) => {
        let primeNumbers = [2];
        for(let j=3; j<=n; j+=2){
            console.log('들어옴');
            console.log(isPrimeNumber(j));
            if(isPrimeNumber(j)) {
                primeNumbers.push(j);
                console.log(primeNumbers);
            }
            
        }

       function isPrimeNumber(n){
            for(let i=3; i<=Math.sqrt(n); i=i+2){
                if(n%i === 0){
                    return false;
                }
            }
            return true;
        };
    
        return primeNumbers.length;
    }
};