package phoneNumberMasking

func Solution(phone_number string) string {
	length := len(phone_number)
	if length < 5 {
		return phone_number
	}

	loopRange := length - 4
	answer := ""

	for index := 0; index < loopRange; index++ {
		answer += "*"
	}
	return answer + phone_number[loopRange:]
}
