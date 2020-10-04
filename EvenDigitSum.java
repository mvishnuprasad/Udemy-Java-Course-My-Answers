public class EvenDigitSum {
    
   public static int getEvenDigitSum(int num){
        if(num<0){
            return -1;
        }

        int b=0;
       while (num!=0){
           int a=num%10;
           num=num/10;

           if(a%2==0){
               b=b+a;
           }
       }


           return b;
   }
}
