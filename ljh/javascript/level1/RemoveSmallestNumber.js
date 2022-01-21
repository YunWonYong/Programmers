// 제일 작은 수 제거하기 (220115 - 220121)
export default class RemoveSmallestNumber {
    solution = (arr) => {
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        let min = arr.reduce((prev, curr) => prev > curr? curr : prev);
        arr.splice(arr.indexOf(min), 1);
        return arr;
    }
}