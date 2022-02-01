import PhoneNumberMasking from '../PhoneNumberMasking';

test(`"01033334444" is 	"*******4444"`, () => {
    expect(new PhoneNumberMasking().solution("01033334444")).toBe("*******4444");
});

test(`"027778888" is "*****8888"`, () => {
    expect(new PhoneNumberMasking().solution("027778888")).toBe("*****8888");
});