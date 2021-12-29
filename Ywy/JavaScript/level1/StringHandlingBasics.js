export default class StringHandlingBasics {
    solution = (s) => s.length === 4 || s.length === 6 ? !/[^0-9]/.test(s) : false;
}
