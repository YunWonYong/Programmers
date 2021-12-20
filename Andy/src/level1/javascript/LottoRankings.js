// 로또의 최고 순위와 최저 순위
function solution(lottos, win_nums) {
    var arr = [ 6,6,5,4,3,2,1 ];
    var zero_count = 0;
    var m = lottos.concat(win_nums);
    var m = m.filter( function(d,i) { 
        if(d == 0) {
            zero_count++;
        }
        else if(m.indexOf(d) == i) return d; 
    } );
    
    var mmax = 12 - m.length;
    return [ arr[mmax], arr[mmax-zero_count] ];
}