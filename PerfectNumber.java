public class PerfectNumber {
        public static boolean isPerfectNumber(int num) {
        if(num<1){
            return false;
        }
        int j=1,c=0;
        while (j>0&&j<num){
            if(num%j==0){
                c+=j;
            }
            j++;
        }

       if(c>1){
           if(num%c==0){
               return true;
           }
           else return false;
       }
       else return false;
    }
}
