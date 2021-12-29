export default class PrimeNumberFind {
    solution = (n) => {
        const numberTable = {};
        let index = 2;
        let count = 2;
        n++;
        do {
            if (numberTable[index] === undefined) {
                count += this.marking(numberTable, n, index);
            }
        } while(++index < n);
        return n - count;
    };

    marking = (numberTable, n, no) => {
        let count = 0;
        let temp = no;
        while((temp += no) < n) {
            if (numberTable[temp] === undefined){
                numberTable[temp] = temp;
                count++;
            }
        }
        return count;
    }
}
