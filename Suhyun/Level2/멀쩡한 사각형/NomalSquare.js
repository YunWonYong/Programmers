function solution(w, h) {

    let answer = (w * h) - (w + h - gcd(w, h));
    console.log(answer);
    return answer;


}
function gcd(w, h) {
    let temp = 0;
    while (h != 0) {
        temp = w % h;
        w = h;
        h = temp;
    }

    return w;
}