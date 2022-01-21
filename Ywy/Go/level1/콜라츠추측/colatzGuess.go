package colatzGuess

func solution(num int) int {
	var count *int = new(int)
	*count = 0
	return Recursive(count, num)
}

func Recursive(count *int, num int) int {
	if num == 1 {
		return *count
	}
	*count = *count + 1
	if *count == 500 {
		return -1
	} else if num%2 == 0 {
		return Recursive(count, num/2)
	}
	return Recursive(count, num*3+1)
}
