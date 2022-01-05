import CaesarCipher from '../CaesarCipher';

test('"a B z" is "e F d"', () => {
    expect(new CaesarCipher().solution("a B z", 4)).toEqual("e F d");
});
