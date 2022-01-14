// 이상한 문자 만들기(220108 - 220114)
export default class MakeStrangeText {
    solution = (s) => {
        const arr = s.split(' ');
        for(let i=0; i<arr.length; i++){
            arr[i] = [...arr[i]]
                    .map((v,i) => i%2==0? v.toUpperCase() : v.toLowerCase())
                    .join('');
        }
        return arr.join(' ');
    }
}