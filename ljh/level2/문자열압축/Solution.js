
// 문자열 압축(220205-220211)

function solution(s) {
    let last = s.length/2;
    let min = compact(s, 1);
    let len = 0;
    for(let i=2; i<=last; i++) {
        let len = compact(s, i);
        if(len < min) {
            min = len;
        }
    }

    return min;
}

function compact(s, n) {
    let len = s.length;
    let last = len - len%n - n;
    let now = s.substring(0, n);
    let compare;
    let count = 1;

    for(let i=n; i<=last; i+=n) {
        compare = s.substring(i,i+n);
        if(now === compare){
            len -= n;
            ++count;
        }else{
            if(count > 1) {
                len += count.toString().length;
            }
            count = 1;
            now = compare;
        }
    }

    if(count > 1) {
        len += count.toString().length;
    }

    return len;
}