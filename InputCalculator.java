import java.util.*;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
              Scanner scn=new Scanner(System.in);
        int c=0,n=0;
        while (true){
            boolean r=scn.hasNextInt();

            if(r){
                int j=scn.nextInt();
                c+=j;
                n++;
            }
            else
            {
                long v = Math.round((double) c / n);
                System.out.println("SUM = "+c+" AVG = "+v);
                break;}

        }
        
    }
}
