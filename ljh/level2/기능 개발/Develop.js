// 기능 개발 (42586)

function solution(progresses, speeds) {
    let need_days = [];
    let release = [];
    for (let i = 0; i < progresses.length; i++) 
        need_days[i] = Math.ceil((100 - progresses[i]) / speeds[i]);
    
    let criterion = need_days[0];
    let count = 0;
    for (let e of need_days) {
        if (e <= criterion) {
            count++;
        } else {
            release.push(count);
            criterion = e;
            count = 1;
        }
    }
    release.push(count);
    
    return release;
}