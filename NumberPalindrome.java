public class NumberPalindrome {
   public  static  boolean isPalindrome(int num) {
int d=num;
        int rev = 0;
        int flag=0;
        int rem = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        
if(rev==d){
    return true;
}
else {
    return false;
}
    }
}

