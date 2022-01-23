//프로그래머스 Level 1,최대공약수와 최소공배수
function solution(n, m) {
    let x = gcd(n,m);
    return [x, n*m/x];
}

function gcd(w,h) {
    let mod = w%h;
    if(mod==0) return h;
    return gcd(h,mod);
}