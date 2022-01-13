import WeirdStringMake from '../WeirdStringMake';

test('"try hello world"	is "TrY HeLlO WoRlD"', () => {
    expect(new WeirdStringMake().solution("try hello world")).toBe("TrY HeLlO WoRlD");
});

test('"try  hello  world" is "TrY  HeLlO  WoRlD"', () => {
    expect(new WeirdStringMake().solution2("try  hello  world")).toBe("TrY  HeLlO  WoRlD");
});
