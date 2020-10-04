public class MegaBytesConverter {
 
public static void printMegaBytesAndKiloBytes (int kiloBytes){
    int mb1=kiloBytes/1024;
    int r=kiloBytes%1024;
    int mb=mb1-r/1024;
   if(kiloBytes>=0){
        System.out.println(kiloBytes+" KB = "+mb+" MB and "+r+" KB");
   }
   
   else{
        System.out.println("Invalid Value");
   }
}
}
