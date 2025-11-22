import java.util.Scanner;

public class WaterLevelMonitor
{
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       int waterlevel;
       waterlevel = scan.nextInt();
    
       if(waterlevel >= 1000){
           System.out.println("WARNING. Water level has reached 1000l or more!!!");
       }
       
       else{
           System.out.println("Status : Normal");
       }
       scan.close();
   }
}