package first100;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int len = 1;
        int y = x;
        while(y/10 > 0) {
            y /= 10;
            len++;
        }
        while(len > 1) {
            if((x % 10) == x/((int)Math.pow(10, len - 1))) {
                x -= (x / (int)Math.pow(10, len - 1)) * (int)Math.pow(10, len - 1);
                x = x / 10;
                len -= 2;
            }else {
                return false;
            }
        }
        return true;
    }
}
