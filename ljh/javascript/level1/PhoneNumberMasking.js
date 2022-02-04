// 핸드폰 번호 가리기 (220129 - 220204)

// 방법1
function solution(phone_number){
    return '*'.repeat(phone_number.length-4) + phone_number.slice(-4);
}

// 방법2
function solution2(phone_number){
    return phone_number.slice(-4).padStart(phone_number.length, '*');
}