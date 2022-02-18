function solution(w, h) {
    if (w === h) {
        return w * h - w;
    }
    
    let count = gcd(w, h); // 단위의 개수
    let unit = 0;  // 한 단위에서 대각선이 지나는 칸의 개수
    let unit_w = w / count; // 한 단위의 w 길이
    while (unit_w > 0) {
        unit += Math.ceil(unit_w * h / w) - Math.floor((unit_w - 1) * h / w);
        unit_w--;
    }

    return w * h - unit * count;
}

function gcd(w, h) {
    if (h === 0) {
        return w;
    } else {
        return gcd (h, w%h);
    }
}