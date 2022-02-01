package level1;

public class PhoneNumberMasking {
	public String solution(String phone_number) {
		return phone_number.replaceAll("[0-9](?=[0-9]{4})", "*");
	}
}
