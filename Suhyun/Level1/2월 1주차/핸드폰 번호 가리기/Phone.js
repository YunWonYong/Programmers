function solution(phone_number) {

    let back=phone_number.slice(-4,phone_number.length);
    let front="*".repeat(phone_number.length-4);
    
    return front+back;
    
    }