const solution = answers => {
	const students = [
		{
			id: 1,
			count: 0,
			pattern: [1, 2, 3, 4, 5]
		},
		{
			id: 2,
			count: 0,
			pattern: [2, 1, 2, 3, 2, 4, 2, 5]
		},
		{
			id: 3,
			count: 0,
			pattern: [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
		}
	];
	const range = answers.length;
	let index = 0;
	return (() => {
        let ranking = [];
        let result = [];
        Object.keys(students).forEach( key => {   
            const student = students[key];
            let {id, count, pattern} = student;
			let prange = pattern.length;
			do {
				if (pattern[index % prange] == answers[index]) {
					count++;
				}
			} while(++index < range);
			index = 0;	
            let temp = ranking[ranking.length - 1];	
			if (ranking.length === 0 || temp.count === count) {
                ranking[ranking.length] = {id: id, count: count};
                result[result.length] = id;
            } else if (temp.count < count){
               ranking = [{id: id, count: count}];
               result = [id];     
            }
		});
		return result;
	})();
};