export default class Nara1234 {
    solution = (orders, course) => {
        const answer = [];
        const courseMenu = {};
        const courses = {};
        course.forEach(el => courses[el] = true);
        let order = {};
        orders.forEach(el => [...el].forEach(at => { order[at] = (order[at] >> 0) + 1 }));
        orders.forEach((el, index, self) => self[index] = [...el].filter(at => order[at] > 1));
        orders.forEach(order => {
            const menus = [...order];
            const range = menus.length;
            const marks = [];
            const stack = [];
            let temp = [];
            let menu = undefined;
            stack.push([0, true]);
            stack.push([0, false]);
            while (true) {
                let [index, flag] = stack.pop();
                marks[index] = flag;
                if (index < range - 1) {
                    stack.push([index + 1, true]);
                    stack.push([index + 1, false]);
                }
                marks.forEach((mark, index) => mark ? temp[index] = menus[index] : undefined);

                menu = temp.sort().join("");
                temp = [];
                if (index >= range - 1 && courses[menu.length]) {
                    courseMenu[menu] = (courseMenu[menu] >> 0) + 1;
                    courses[menu.length] = Math.max(courses[menu.length], courseMenu[menu]);
                }
                if (stack.length === 0) {
                    return;
                }
            }
        });

        Object.keys(courseMenu).forEach(menu => {
            if (courseMenu[menu] < 2 || (courses[menu.length] || true) === true) {
                return;
            } else if (courseMenu[menu] === courses[menu.length]) {
                answer.push(menu);
            }
        });
        return answer.sort();
    };
}