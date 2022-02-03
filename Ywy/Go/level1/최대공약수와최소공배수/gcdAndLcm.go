package gcdAndLcm

func Solution(n, m int) (answer []int) {
	gcd := Gcd(n, m)
	lcm := m / gcd * n
	return []int{gcd, lcm}
}

func Gcd(n, m int) int {
	if m == 0 {
		return n
	}
	return Gcd(m, n%m)
}
