// 문자열 내 마음대로 정렬하기 (12/18 - 12/24)
export default class SortMyWay{
    solution = (strings, n) => {
        strings = strings.map((str) => str = str.substring(n, n+1) + str);
        strings.sort();
        strings = strings.map((str) => str = str.slice(1));
    
        return strings;
    }
}