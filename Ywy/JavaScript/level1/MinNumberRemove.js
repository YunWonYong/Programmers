export default class MinNumberRemove {
    solution = (arr) => {
        delete arr[arr.indexOf(Math.min(...arr))];
        arr = arr.flat();
        return arr.length ? arr : [-1];
    };
}