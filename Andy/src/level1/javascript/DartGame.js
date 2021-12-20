//프로그래머스 Level 1,[1차] 다트 게임

function solution(dartResult) {    
    var answer = 0;
    
    var dart = [];
    let tmp = new Dart();
    [...dartResult].forEach( (d) => {
        if(isNaN(d) == false) {
            if(tmp.d.length >0) {
                dart.push(new Dart(tmp));
                tmp.init();
            }
            tmp.jumsu += d;
        }
        else {
            if(d == "S" || d == "D" || d == "T")    
                tmp.d = d;
            if(d == "*") tmp.star = 2;
            if(d == "#") tmp.m = -1;
        }
    });
    dart.push(new Dart(tmp));
    
    var arr=[];
    for(let i=0;i<3;i++) {
        arr[i] = dart[i].getJumsu();
        if(i && dart[i].star>1) arr[i-1] *= 2;
    }

    answer = arr.reduce( (a,d) => { return a+d;});
    return answer;
}

class Dart {
    getJumsu() {
        let doubleScore = 1;
        if(this.d == "D") doubleScore = 2;
        else if(this.d == "T") doubleScore = 3;
        return Math.pow(this.jumsu,doubleScore) * this.star * this.m;
    }
    init() {
        this.jumsu = "";
        this.d = "";
        this.star = 1;
        this.m = 1;
    }
    constructor(dart) {
        if(dart == null || dart == undefined) {
            this.init();            
        }
        else {
            this.jumsu = dart.jumsu;
            this.d = dart.d;
            this.star = dart.star;
            this.m = dart.m;
            
        }
    }
}