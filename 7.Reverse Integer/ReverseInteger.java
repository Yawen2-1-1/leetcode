/****************************
 **  Runtime: 1ms          **
 **  Memory Usage: 36.1 MB **
 ****************************/

public class ReverseInteger {
    public int reverse(int x) {
        // avoid buffer overflow caused by number reversed greater than 
        // Integer.MAX_VALUE(2^31 - 1), or less than Integer.MIN_VALUE(- 2^31),
        // so declare the output as long (2^63)
        int remainder = 0;
        long output = 0;
        while (x != 0) {
            remainder = x % 10;
            x = x / 10;
            output = output * 10 + remainder;
        }

        // check whether the number reversed is greater than Integer.MAX_VALUE
        // or less than Integer.MIN_VALUE, if so, return 0
        if (output > Integer.MAX_VALUE || output < Integer.MIN_VALUE) return 0;

        return (int)output;
    }
}
