import "math"

func reverse(x int) int {
	var n int = 0 // assign reversed x to n
	var r int = 0 // remainder
	for x != 0 {
		r = x % 10
		x = x / 10
		n = n*10 + r
		if n > math.MaxInt32 || n < -math.MaxInt32-1 { // avoid buffer overflow
			return 0
		}
	}

	return n
}