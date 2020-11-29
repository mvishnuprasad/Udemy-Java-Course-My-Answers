import java.util.*;
public class PaintJob {
 public static int getBucketCount(double width,double height , double areaPerBucket, int extraBuckets){
        double a=width*height;
        double num= (double) a/areaPerBucket;
        double r=Math.ceil(num-extraBuckets);
        int b=(int)r;
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;}
        else
            return b;

    }

    public static int getBucketCount(double width,double height , double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }
        double a=width*height;
        double num= (double) a/areaPerBucket;
        double r=Math.ceil(num);
        int b=(int)r;
        return b;
    }

    public static int getBucketCount(double area , double areaPerBucket){
        if(area<=0||areaPerBucket<=0){
            return -1;
        }

            double num= (double) area/areaPerBucket;
        double r=Math.ceil(num);
        int b=(int)r;

        return b;
    }

}
