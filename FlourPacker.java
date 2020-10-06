public class FlourPacker {
   public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0||smallCount<0||goal<0){
            return false;
        }
        int b=bigCount*5;
        int s=smallCount;
        if(b+s==goal){
            return true;
        }
        if(b+s>goal){
            if(s==0&&goal%5==0&&b>=goal){
                return true;
            }
            if(b==0&&s>=goal){
                return true;
            }
            else if(b!=0&&s!=0&&(b+s)>=goal){
                int x=goal-goal%5;
                int y=goal%5;
                if(y==0&&b>=goal){
                    return true;
                }
               else if(y!=0&&s>=y){
                    return true;
                }
                 else if(y!=0&&s<y){
                    return false;
                }
            }
        }
        return false;
    }
}
