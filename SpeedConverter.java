public class SpeedConverter {
   public static void printConversion(double kilometersPerHour){
       long KMPH=toMilesPerHour(kilometersPerHour);
       if(KMPH<0){
           System.out.println("Invalid Value");
       }
       else{
           System.out.println(kilometersPerHour+" km/h = "+KMPH+" mi/h");
       }
   }
    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        else{
            long m=Math.round (kilometersPerHour/1.609);
            return m;
        }
    }
    
}
