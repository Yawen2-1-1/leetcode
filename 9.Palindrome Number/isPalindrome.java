/*********************************
 **     Runtime: 6ms            **
 **     Memory Usage: 37.9 MB   **
 *********************************/

public class isPalindrome {
    public boolean isPalindrome(int x) {
        /* negative number is never palindrome, and 0 is palindrome*/
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }

        /* if the number is greater than 0, then reverse number to check if it's palindrome */
        int temp = x;
        long output = 0; // number reversed as long int
        while (temp != 0) {
            output = output * 10 + (temp % 10);
            temp = temp / 10;
        }

        /* check if the number reversed is greater than Integer.MAX_VALUE or less than
           Integer.MIN_VALUE, if so, then return false */
        if (output < Integer.MIN_VALUE || output > Integer.MAX_VALUE) return false;

        /* compare two variables reverse and x */
        return x == (int)output;
    }
}
