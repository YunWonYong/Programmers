const solution = (sizes) => {
    const max = Math.max(...sizes.flat());
    const ys = [];
    sizes.forEach(el => {
        if ( max - el[0] > max - el[1]) {
            ys.push(el[0]);
            return;
        }
        ys.push(el[1]);
    });
    return Math.max(...ys) * max;
};

solution([[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]);
solution([[60, 50], [30, 70], [60, 30], [80, 40]]);
solution([[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]);