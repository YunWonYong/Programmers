export default class Nara1234 {
    reg = /^[a-z]{2}$/i;
    solution = (str1, str2) => {
        let A = {};
        let B = {};
        let index = 0;
        let range = Math.max(str1.length - 1, str2.length - 1);
        let temp = undefined;
        let a, b;

        while (index < range) {
            temp = this.check(str1[index] + str1[index + 1], str2[index++] + str2[index]);
            a = temp[0];
            b = temp[1]
            if (a) {
                A[a] = (A[a] >> 0) + 1;
            }
            if (b) {
                B[b] = (B[b] >> 0) + 1;
            }
        }

        const union = [];
        const intersection = [];
        let A_KEYS = Object.keys(A);
        let B_KEYS = Object.keys(B);
        if (A_KEYS.length < B_KEYS.length) {
            temp = A
            A = B;
            B = temp;
            temp = A_KEYS;
            A_KEYS = B_KEYS;
            B_KEYS = temp;
        }
        let aKey = undefined;
        let bKey = undefined;
        index = 0;
        range = Math.max(A_KEYS.length, B_KEYS.length);
        while (index < range) {
            aKey = A_KEYS[index++];
            bKey = B_KEYS.indexOf(aKey);
            if (bKey === -1) {
                this.append(union, aKey, A[aKey] >> 0);
                continue;
            }
            this.append(union, aKey, Math.max(A[aKey] >> 0, B[aKey] >> 0));
            this.append(intersection, aKey, Math.min(A[aKey] >> 0, B[aKey] >> 0));
        }
        index = 0;
        range = Math.min(A_KEYS.length, B_KEYS.length);
        while (index < range) {
            bKey = B_KEYS[index++];
            aKey = A[bKey];
            if (union.indexOf(bKey) === -1) {
                this.append(union, bKey, B[bKey] >> 0);
                continue;
            }
        }
        const answer = intersection.length === 0 && union.length === 0 ? 1 : intersection.length / union.length;
        return answer * 65536 >> 0;
    };

    check = (...strs) => {
        strs.forEach((str, index, self) => self[index] = this.checkAndUpperCase(str));
        return strs;
    };

    checkAndUpperCase = a => this.reg.test(a) ? a.toUpperCase() : null;

    append = (arr, el, range) => {
        if (range === 0) {
            return;
        }
        while (true) {
            arr.push(el);
            if (--range <= 0) {
                return;
            }
        }
    };
}