package averege

// type casting count const 2
func Solution(arr []int) float64 {
	total := 0
	avg := float64(len(arr))
	for _, element := range arr {
		total += element
	}
	return float64(total) / avg
}

// type casting count N
func Solution2(arr []int) float64 {
	total := 0.0
	avg := 0.0
	for _, element := range arr {
		total += float64(element)
		avg += 1.0
	}
	return total / avg
}
