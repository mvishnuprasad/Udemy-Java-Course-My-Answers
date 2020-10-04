public class GreatestCommonDivisor {
    
    public static int getGreatestCommonDivisor(int first, int second) {
         if(first<10||second<10){
            return -1;
        }
        int j=1,u=1;
        while(first>=0){
            int r=first%j;
            int s=second%j;
            if(r==0&&s==0){
               u=j;
            }
            j++;

            if(j>first&&j>second){
                break;
            }
        }
        return u;
    }
}
