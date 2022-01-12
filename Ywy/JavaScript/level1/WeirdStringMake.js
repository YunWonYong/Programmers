export default class WeirdStringMake {
    solution = s => {
        let index = 0;
        return [...s].map(at => {
            if (at == " ") {
                index = 0;
                return at;
            }
            return index++ % 2 === 0 ? at.toUpperCase() : at.toLowerCase();
        }).join("");
    };

    solution2 = s => s.split(" ").map(str => [...str].map((at, index) => index % 2 > 0 ? at.toLowerCase() : at.toUpperCase())).join(" ").replace(/,/g, "");

} 