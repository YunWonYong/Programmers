export default class Tuple {
    solution = (s) => {
        const answer = [];    
        
        s = s.replace(/[{]/g, "")
            .replace(/[}]{2}/,"")
            .split(/[}]+[,]+/g);
        const obj = {};
        s.forEach(e => {
            const temp = e.split(",");
            obj[temp.length] = Array.from(temp, (el) => el >> 0);
        });    
        
        Object.keys(obj).forEach( key => {
            let arr = obj[key];
            let index = 0;
            let range = arr.length;
            let el = undefined;
            while(index < range) {
                el = arr[index];
                if (answer.indexOf(el) > -1) {
                    arr.splice(index, index + 1);
                    range--;
                    continue;
                }
                index++;
            }
            answer.push(arr[0]);
        });
        
        return answer;
    };
}