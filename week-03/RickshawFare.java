import java.util.Scanner;

public class RickshawFare
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       double baseFare = 50;
       double perKM = 30;
       double perMin = 3;
       double localDis = 0.15;
       double surcharge = 0.20;
       //input
       System.out.println("Enter the distance in kilometers");
       double distance = sc.nextDouble();
       
       System.out.println("Enter the time (in mins)");
       double time = sc.nextDouble();
       
       System.out.println("Is the customer a local? (yes/no)");
       String local = sc.next().toLowerCase();
       
       System.out.println("Is it night time? (yes/no)");
       String night = sc.next().toLowerCase();
       
       double fare = baseFare + (distance * perKM) + (time * perMin);//calculation
       
       if(local.equals("yes") && distance > 10){
           fare -= fare * localDis;
       }
       
       if(night.equals("yes")){
           fare += fare * surcharge;
       }
       //output
       System.out.println("the total fare is Rs" + fare);
       sc.close();
}
}
