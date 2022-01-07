// 시저암호 (211231 - 220107)
export default class CaesarCipher {
    
    solution = (s , n) => {
        let replaced_str = s.replace(/[a-z]/g, (value) => {
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