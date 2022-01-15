// 정수 내림차순으로 배치하기(220115 - 220121)
export default class Arrange {
    solution = (n) => {
        return Number([...n+''].sort((a,b)=>(b-a)).join(''));
    }
}