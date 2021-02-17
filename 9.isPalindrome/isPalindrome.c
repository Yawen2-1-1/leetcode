/***************************
 **  Runtime: 8ms          *
 **  Memory Usage: 5.9 MB  *
 ***************************/

bool isPalindrome(int x){
    /* if x is a palindrome number, either x or reversedX will be out of the bit range. */
    if (x < INT_MIN || x > INT_MAX) {
        return false;
    } else if (x < 0) {     /* negative numbers are never palindrome */
        return false;
    } else if (x < 10) {    /* 1 ~ 10 are palindrome */
        return true;
    }
    
    /* for comparing x and reversedX, declare temp to save the value of x */
    int temp = x;
    long reversedX = 0;
    while(temp != 0) {
        reversedX = reversedX * 10 + (temp % 10);
        temp = temp / 10;
    }
    
    return x == reversedX;
}
