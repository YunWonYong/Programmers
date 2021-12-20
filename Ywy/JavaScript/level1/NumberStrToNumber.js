const solution = (str) => { 
    let answer = str;
    const numStrs = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    const reg = new RegExp("", "g");
    return (() => {
        numStrs.forEach( (el, index) => {
            reg.compile(el, "g");
            answer = answer.replace(reg, index); 
        });
        return parseInt(answer);
    })();
}