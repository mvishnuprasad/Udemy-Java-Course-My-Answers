public class LargestPrime {
    public static int getLargestPrime(int num){
        int i=2,f=0,c=0;
        if(num<=1){
            return -1;
        }
        while ( i>=2&&i<=num){
            if (num%i==0){
                for (int j=2;j<i;j++){
                    if(i%j==0) {
                        f=1;
                    }
                }
                if(f==0){
                    c=i;
                }
             
            }
            i++;
        }
        return c;
    }
}
