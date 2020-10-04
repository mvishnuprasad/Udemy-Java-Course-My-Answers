public class LastDigitChecker {

    public static boolean isValid(int p){
        if(p>=10&&p<=1000){
            return true;
        }
        else {
            return false;
        }

    }
    public static boolean hasSameLastDigit(int a,int b,int c) {
        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {
            return false;
        } else {
            int d = a % 10;
            int e = b % 10;
            int f = c % 10;
            if (d == e || d == f || e == f || e == d || f == e || f == d) {
                return true;
            } else {
                return false;
            }
        }
    }
}
