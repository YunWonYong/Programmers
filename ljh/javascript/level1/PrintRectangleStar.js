// 직사각형 별찍기(220129 - 220204)
process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b= Number(n[1]);
    let count = 0;

    let s = `*`.repeat(a);
    while(++count <= b){
        console.log(s);
    }
})