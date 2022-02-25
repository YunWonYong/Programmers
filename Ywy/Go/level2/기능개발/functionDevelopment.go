package functionDevelopment

import "fmt"

func solution(progresses []int, speeds []int) []int {
	var (
		size                                                = len(progresses)
		answer                                              = make([]int, 0, size)
		table                                               = make(map[string]int, size)
		key                                                 string
		count, progress, speed, necessaryPeriod, max, index int
	)
	for {
		progress = progresses[index]
		speed = speeds[index]
		key = keyGen(progress, speed)
		necessaryPeriod = table[key]
		if necessaryPeriod == 0 {
			necessaryPeriod = getNecessaryPeriod(progress, speed)
			if max == 0 {
				max = necessaryPeriod
			}
		}
		if max < necessaryPeriod {
			answer = append(answer, count)
			count = 0
			max = necessaryPeriod
		}
		count++
		index++
		if index == size {
			answer = append(answer, count)
			return answer
		}
	}
}

func keyGen(progress, speed int) string {
	return fmt.Sprintf("%d_%d", progress, speed)
}

func getNecessaryPeriod(progress, speed int) (time int) {
	for {
		time++
		if progress >= 100 {
			return time
		}
		progress += speed
	}
}
