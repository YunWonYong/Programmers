// 평균 구하기(220122-220128)
export default class CalculateAverage {
    solution = (arr) => {
        return arr.reduce((a,b) => a+b, 0) / arr.length;
    }
}