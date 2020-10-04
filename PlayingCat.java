public class PlayingCat {
   public static boolean isCatPlaying(boolean summer, int t){
       if(summer==false&&t<=35&&t>=25){
           return true;
       }
       else  if(summer==true&&t<=45&&t>=25){
           return true;
       }
       else {
           return false;
       }
   }
}
