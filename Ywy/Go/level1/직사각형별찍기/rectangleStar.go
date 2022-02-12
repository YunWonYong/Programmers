package main

import (
	"fmt"
	"strings"
)

func main() {
	var a, b int
	fmt.Scan(&a, &b)
	tuple := strings.Repeat("*", a)
	fmt.Println(strings.Repeat(tuple+"\n", b))
}
