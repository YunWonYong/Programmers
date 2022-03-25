// 괄호 변환
function solution(p) {
    let point = getPoint(p);
    let u = p.substring(0, point);
    let v = p.substring(point);
    if(correct(u)) {
        return v.length === 0? u : u + solution(v);
    }
    let changed = '';
    if(u.length > 2) {
        changed = [...u].map(v => v = v === '(' ? ')' : '(' ).join('').slice(1, -1);
    }
    return '(' + solution(v) + ')' + changed;
}

function correct(u) {
    let sum = 0;
    for (let i = 0; i < u.length; i++) {
        u[i] === '('? sum++ : sum--;
        if (sum < 0) return false;
    }
    return true;
}

function getPoint(p) {
    let sum = 0;
    let i;
    for (i = 0; i < p.length; i++) {
        p[i] === '('? sum++ : sum--;
        if (sum === 0) return i + 1;
    }
    return i;
}