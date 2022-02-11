export default class StringCompression {
    solution = (s) => {
        let range = s.length;
        let position = Math.floor(range / 2);
        let len = range;
        let begin = 0;
        let end = position;
        let matchedStr = s.substring(begin, end);
        let matchedCount = 1;
        let nextStr = null;
        let temp = [];
        while (true) {
            if (position === 0) {
                return len;
            }

            begin = end;
            end += position;
            nextStr = s.substring(begin, end);

            if (matchedStr === nextStr) {
                matchedCount++;
                continue;
            }

            if (matchedCount > 1) {
                temp.push(matchedCount);
                matchedCount = 1;
            }

            temp.push(matchedStr);
            matchedStr = nextStr;

            if (nextStr) {
                continue;
            }

            temp = temp.join("");

            if (temp.length < len) {
                len = temp.length;
            }

            temp = [];
            end = --position;
            matchedStr = s.substring(0, end);
        }
    };
}