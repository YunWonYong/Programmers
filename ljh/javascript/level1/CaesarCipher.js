// 시저암호 (211231 - 220107)
export default class CaesarCipher {
    solution = (s , n) => {
        const pattern1 = /^6{1}[5-9]{1}$|^[7-8]{1}[0-9]{1}$|^9{1}[1]{1}$/g; //65-90, 소문자
        const pattern2 = /^9{1}[7-9]{1}$|^1{1}[0,1]{1}[0-9]{1}$|^1{1}2{1}[0-2]{1}$/g; //97-122, 대문자

        s.replace(/ +/,' ');
        s.replace(/[a-z]/g, (value) => {
            value = value.charCodeAt() + n;
            return pattern1.test(value)? String.fromCharCode(value) : String.fromCharCode(value - 26); 
        });
        s.replace(/[A-Z]/g, (value) => {
            value = value.charCodeAt() + n;
            return pattern2.test(value)? String.fromCharCode(value) : String.fromCharCode(value - 26); 
        });

        return s;
    }
}