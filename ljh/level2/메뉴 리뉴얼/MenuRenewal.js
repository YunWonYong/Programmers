// 메뉴 리뉴얼
function solution(orders, course) {
    const answer = [];
    for (const c of course) {
        const map = new Map();
        for (let o of orders) {
            if (c.length >= o.length) 
                continue; 
            o = [...o].sort().join('');
            combination(map, o, c, '', 0);
        }
        let max = [...map.values()].reduce((a,b) => a > b ? a : b, 0);
        [...map.entries()].forEach(([key, value]) => {
            if(value === max && value > 1)
                answer.push(key);
        });
    }                     
    return answer.sort();
}
function combination(map, o, r, s, start) {
    if (r === 0) {
        if (map.has(s)) {
            map.set(s, map.get(s) + 1);
            return;
        } 
        map.set(s, 1);
    }
    for (let i = start; i<o.length; i++) {
        combination(map, o, r - 1, s.concat(o[i]), i + 1);
    }
}