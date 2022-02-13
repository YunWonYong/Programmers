function solution() {
    let s = "abcabcdede";
    let answer = s.length;

    let arr = "";
    let current = "";
    let flag = true;

    for (let i = 1; i <= s.length / 2; i++) {
        let temp = s.substring(0, i);
        let count = 1;

        for (let j = 1; j < s.length; j++) {
            if (i * j <= s.length - 1) {
                current = s.substring(i * j, Math.min(i * j + i, s.length));
            } else {
                if (count > 1) {
                    arr += count + temp;
                } else {
                    arr += temp;
                }
                break;
            }
            if (temp == current) {
                count++;
                if (j + 1 == s.length) {
                    if (count > 1) {
                        arr += count + temp;
                        flag = false;
                    } else {
                        arr += temp;
                    }
                }
            }
            else {
                if (count > 1) {
                    arr += count + temp;
                } else {
                    arr += temp;
                }

                temp = current;
                count = 1;
            }
        }

        if (arr.length < answer) {
            answer = arr.length;
        }
        arr = "";

        if (answer + 1 == s.length && flag) {
            answer = s.length;
        }
    }


    return answer;
}