// 시저암호 (211231 - 220107)
export default class CaesarCipher {
    solution = (s , n) => {
        const alphabetPattern = /^6{1}[5-9]{1}$|^[7-8]{1}[0-9]{1}$|^9{1}[0,7-9]{1}$|^1{1}[0,1]{1}[0-9]{1}$|^1{1}2{1}[0-2]{1}$/g;
        //65-90, 97-122

        s = s.replace(/ +/,' ');
        s = s.replace(/[A-Za-z]/, (value) => {
                value = value.charCodeAt() + n;
                return alphabetPattern.test(value)? String.fromCharCode(value) : String.fromCharCode(value - 26); 
            });

        return s;
    }
}