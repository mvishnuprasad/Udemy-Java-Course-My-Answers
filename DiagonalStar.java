public class DiagonalStar {
     public static void printSquareStar(int c){
         if(c<5){
             System.out.println("Invalid Value");
         }
       
     else{
          for (int i=0;i<c;i++){
          for (int j=0;j<c;j++){
              if(i==0||j==0||i==j||i==c-1||j==c-1||i==c-j-1){
                  System.out.print("*");
              }
              else System.out.print(" ");
          }
          System.out.println("");
      }
     }
    }
}
