public class AreaCalculator {
    public static double area(double radius){
        double pi=Math.PI;
        if(radius<0){
            return -1;
        }
        else{
            return pi*radius*radius;
        }
    }
    public static double area(double x,double y){
        if(x<0||y<0){
            return -1;
        }
        else{
            return x*y;
        }
    }
     
}
