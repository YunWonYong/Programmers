export default class CaesarCipher {
    solution = (s, n) => {
        const answer = [];
        let at = null;
        let index = 0;
        while((at = s.charCodeAt(index++))) {
            answer.push(String.fromCharCode(this.getMoveAt(n, at)));
        }
        return answer.join("");
    };

    getMoveAt = (moveCount, at) => {
        if (at > 32) {
            while(--moveCount > -1) {
                at++;
                if (at > 122) {
                    at = 97;
                } else if (at < 97 && at > 90) {
                    at = 65;
                }
            }   
        }
        return at;
    }
}
