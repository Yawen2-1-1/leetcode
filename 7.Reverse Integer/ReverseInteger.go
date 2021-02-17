/***************************
 **  Runtime: 4ms         **
 **  Memory Usage: 2.2 MB **
 ***************************/

import "math"

func reverse(x int) int {
	var output int = 0 // assign reversed x in output, and declare output as int32 to avoid buffer overflow
	var remainder int = 0
	for x != 0 {
		remainder = x % 10
		x = x / 10
		output = output * 10 + remainder
		// constraint: -2^31 <= output <= 2^31 - 1
		if output > math.MaxInt32 || output < -math.MaxInt32-1 {
			return 0
		}
	}

	return output
}
