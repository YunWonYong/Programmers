export default class NumberSquareRootDiscrimination {
    solution = (num) => {
        let squareNum = Math.floor(Math.sqrt(num));
        //return squareNum * squareNum === num ? ++squareNum * squareNum : -1;
        return squareNum * squareNum === num ? ++squareNum ** 2 : -1;
    };
}