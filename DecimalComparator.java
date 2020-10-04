public class DecimalComparator{
 public static boolean areEqualByThreeDecimalPlaces(double p,double q){
     double a=p*1000;
     double b=q*1000;
    if( (int)a==(int)b){
        return true;
    }
    else{
        return false;
    }
 }
}
