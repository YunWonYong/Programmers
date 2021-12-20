import StringDescending from '../StringDescending';

const testCase = [
    "Zbcdefg",
	"gfedcbZ",
	"abcdefg",
	"ABCDEFG",
	"abcdefghijklmnopqrstuvwxyz",
	"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
];
const answers = [
    "gfedcbZ",
	"gfedcbZ",
	"abcdefg",
	"ABCDEFG",
	"abcdefghijklmnopqrstuvwxyz",
	"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
];
test("Zbcdefg is gfedcbZ", () => {
    expect(new StringDescending().solution("Zbcdefg")).toEqual("gfedcbZ");
});