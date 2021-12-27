// 문자열 다루기 기본(211224 - 211230)

export default class HandlingString {
    solution = (s) => {
        return !(/[^0-9]/.test(s)) && (s.length === 4 || s.length === 6);
    };
};