public class FirstLastDigitSum {

   public static int sumFirstAndLastDigit(int num){
        if(num<0){
            return -1;
        }
        int last=num%10;

        int b=0;
       while (num!=0){
           int a=num%10;

           num=num/10;
           if(a<10){
               b=a;
           }
       }
       int r=last+b;
       
           return r;
   }


}
