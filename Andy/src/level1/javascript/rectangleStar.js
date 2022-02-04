//프로그래머스 Level 1,직사각형 별찍기
process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    
    let str = "*".repeat(a) + "\n";
    console.log(str.repeat(b));

});