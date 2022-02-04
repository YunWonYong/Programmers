process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    let [a, b] = data.split(" ");
    a++;
    console.log("\n".padStart(a, "*").repeat(b));
});