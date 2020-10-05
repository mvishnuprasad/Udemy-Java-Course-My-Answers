public class NumberToWords {
    
  public static void numberToWords(int num){
      if(num<0){
          System.out.println("Invalid Value");
      }
        int rev=reverse(num);
        int s=getDigitCount(num);
        while (rev!=0||s>0){
         int r=rev%10;
            switch (r){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }

            rev=rev/10;
            s--;

        }


    }
   public static int reverse(int n){
        int rev1=0;
        while (n!=0){
            int s=n%10;
            rev1=rev1*10+s;
            n=n/10;
        }
        return rev1;
    }
    public static int getDigitCount(int m){
        if(m<0){
            return -1;
        }
        if(m==0){
            return 1;
        }
        int c=0;
        while (m>0){
            int t=m%10;
            c++;
            m=m/10;
        }
        return c;
    }
}
