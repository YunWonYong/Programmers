const solution = (absolutes, signs) => 
    absolutes.map((el, index) => signs[index] ? el : ~el + 1)
             .reduce((pre, next) => pre + next);