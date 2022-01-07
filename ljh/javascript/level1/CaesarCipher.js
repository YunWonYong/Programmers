// 시저암호 (211231 - 220107)
export default class CaesarCipher {
    
    solution = (s , n) => {
        //const upper_pattern = /^6{1}[5-9]{1}$|^[7-8]{1}[0-9]{1}$|^9{1}1{1}$/g; //65-90, 대문자
        //const lower_pattern = /^9{1}[7-9]{1}$|^1{1}[0,1]{1}[0-9]{1}$|^1{1}2{1}[0-2]{1}$/g; //97-122, 소문자

        let replaced_str = s.replace(/ +/g,' ');

        replaced_str = replaced_str.replace(/[a-z]/g, (value) => {
            value = value.charCodeAt() + n;
            return value > 122 ? String.fromCharCode(value - 26) : String.fromCharCode(value); 
        });
        replaced_str = replaced_str.replace(/[A-Z]/g, (value) => {
            value = value.charCodeAt() + n;
            return value > 90 ? String.fromCharCode(value - 26) : String.fromCharCode(value); 
        });

        return replaced_str;
    }
}