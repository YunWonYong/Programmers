import CaesarCipher from '../CaesarCipher';
test(`시저암호`,()=>{
    expect(new CaesarCipher().solution("AB", 1)).toEqual("BC");
});

test(`시저암호`,()=>{
    expect(new CaesarCipher().solution("z", 1)).toEqual("BC");
});

test(`시저암호`,()=>{
    expect(new CaesarCipher().solution("a B                   z", 4)).toEqual("e F d");
});
