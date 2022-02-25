//프로그래머스 Level 2,멀쩡한 사각형
function gcd(w,h) {
    let mod = w%h;
    if(mod==0) return h;
    return gcd(h,mod);
}

function solution(w, h) {
    return w*h - (w+h-gcd(w,h));
}