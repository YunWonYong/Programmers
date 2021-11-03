const solution = (array, commands) => {
	let answer = [];
    let temp = null;
	commands.forEach((command, index) => {
    	debugger;	
        temp = array.slice(--command[0], command[1]);
        temp.sort((a, b) =>  a > b ? 1 : a < b ? -1 : 0);
        answer[index] = temp[--command[2]];
	});
	return answer;
};
solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]);