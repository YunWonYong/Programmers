export default class GCDandLCM {
    solution = (n, m) => {
        let large = n;
        let small = m;
        let answer = [];

        if(n<m){
            large = m;
            small = n;
        }

        let temp = large % small;

        while(temp != 0){
            large = small;
            small = temp;
            temp = large % small;
        }

        answer.push(small);
        answer.push(n*m/small);
        
        return answer;
    }
}