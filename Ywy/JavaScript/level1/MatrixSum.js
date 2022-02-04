export default class MatrixSum {
    solution = (arr1, arr2) => Array.from(arr1, (a, i) => a.map((el, j) => el += arr2[i][j]));
}