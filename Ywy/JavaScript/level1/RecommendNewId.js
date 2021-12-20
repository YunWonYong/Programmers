const solution = (new_id) => {
    let answer = getLengthZeroText(new_id).toLowerCase();
    let length = new_id.length;
    let checks = [
                  /[^0-9a-z\-\_\.]/g, "", 
                  /[\.]{1,}/g, ".",
                  /(^[\.]|[\.]$)/ , ""
                 ];
    let range = checks.length;    
    let index = 0;
    let left = null;
    let right = null;
    if (length > 0) {
        while(index < range) {
            left = checks[index++];
            right = checks[index++];
            answer = answer.replace(left, right);
            if (index === range) {
                answer = answer.substring(0, 15).replace(left, right);    
            }
            answer = getLengthZeroText(answer);
            if (answer === "aaa") {
                return answer;
            } 
        }
    }
    return answer.length < 3 ? lastTextAppend(answer) : answer;
}

const lastTextAppend = (str) => {
    let char = str.substring(str.length - 1, str.length);
    while(str.length < 3) {
        str += char;
    }
    return str;
}

const getLengthZeroText = (str) => {
    return str.length < 1 ? "aaa" : str; 
}