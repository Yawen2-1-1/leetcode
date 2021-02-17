/****************************
 **  Runtime: 0ms          **
 **  Memory Usage: 5.6 MB  **
 ****************************/

int reverse(int x){
    // save reversed x in output
    // avoid buffer overflow: declare output as long int
    int remainder = 0;
    long int output = 0;
    while (x != 0) {
        remainder = x % 10;
        x  = x / 10;
        output = output * 10 + remainder;
    }
    
    // constraint: -2^31 <= x <= 2^31 - 1
    if (output < INT_MIN || output > INT_MAX) return 0;
    
    return (int)output;
}
