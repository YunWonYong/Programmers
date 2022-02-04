package level1.java;
//프로그래머스 Level 1,핸드폰 번호 가리기
public class hidePhoneNumber {
    public String solution(String phone_number) {
        return "*".repeat(phone_number.length()-4) + phone_number.substring(phone_number.length()-4);
    }
}
