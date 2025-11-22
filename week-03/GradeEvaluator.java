import java.util.Scanner;

public class GradeEvaluator
{
    public static void main(String[] args){
        double percentage;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your percentage: ");
    percentage = scanner.nextDouble();
    
    if(percentage >= 40 ) {
      System.out.println(" youve passed the exam");  
    }
    else{
        System.out.println(" youve failed the exam");
    }
    
    scanner.close();
}
}
