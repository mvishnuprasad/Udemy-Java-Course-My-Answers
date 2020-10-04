public class SumOddRange {
 
  public static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        if(number%2!=0){
            return true;
        }
        else
            return false;
    }
    public static int sumOdd(int start, int end){
        int c=0;
        for(int i=start;i<=end;i++){
            if(isOdd(i)==true){
                c+=i;
               
            }
           
        }
 if(start>0&&end>0&&end>=start)
                return c;
else
return -1;
    }

 
}
