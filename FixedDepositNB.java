import java.util.Scanner;
public class FixedDepositNB
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       boolean run = true;
       
       while(run){   
       System.out.println("FD calculator!!");
       System.out.println("Enter deposit amount(minimum = Rs. 1000):");
       double P = sc.nextDouble();
       
       if(P<1000){
           System.out.println("The minimum deposit amount is Rs.1000");
           continue;
       }
       
       System.out.println("Enter Annual Rate(8-12%): ");
       double annualRate = sc.nextDouble();
       if(annualRate < 8 || annualRate > 12){
           System.out.println("The rate must be between 8-12%!!");
           continue;
       }
    
       System.out.println("Enter the duration(in years, maximum = 5years)");
       int duration = sc.nextInt();
       if(duration<=0 || duration >5){
           System.out.println("ERROR: duration must be 1-5 years");
           continue;
       }
       
       //calculation
       double monthlyRate = (annualRate / 100)/12;
       int months = duration * 12;
       
       double A = P * Math.pow((1 + monthlyRate),months);
       
       double feeRate = 0.005;
       double fee = A * feeRate;
       
       double totalAmount = A - fee;
       
       //displaying results
    
       System.out.println("fixed deposit calculations ;]");
       System.out.println("Principal : Rs." + P);
       System.out.println("Annual Rate: " + annualRate + "%");
       System.out.println("Duration: " + duration + "years" + "(months: "+ months +")");
       System.out.println("Maturity Amount (before fee): Rs." +  String.format("%.2f",A));
       System.out.println("Processing fee(0.5%): Rs." + String.format("%.2f", fee));
       System.out.println("The total amount you receive: Rs." + String.format("%.2f", totalAmount));
       
       
       //for futher calcuations from the user
       
       System.out.println("Do you want to calculate another FD? (y/n)");
       char choice = sc.next().charAt(0);
       
       if(choice == 'n'|| choice =='N'){
           run = false;
       }
       
       
 
    }
    System.out.println("Thank you for using");
    sc.close();
}
}