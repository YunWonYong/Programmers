// 문자열 내림차순으로 정렬하기(12/18 - 12/24)
export default class SortInDescendingOrder {
    solution = (s) => {
        let answer = [];
        for(let c of s) answer.push(c.charCodeAt());
        answer.sort((a, b) => b - a);
        return answer.map((value) => String.fromCharCode(value)).join('');
    }
}