import java.util.Scanner;

public class GradeEvaluator
{
    public static void main(String[] args){
        double grade;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your grade: ");
    grade= scanner.nextDouble();
    
    if(grade >= 30 && grade <= 40 ) {
      System.out.println("Your grade is C+");  
    }
    else if(grade >= 41 && grade <= 50 ) {
      System.out.println("Your grade is C+");  
    }
    else if(grade >= 51 && grade <=60){
        System.out.println("your grade is C");
    }
    else if(grade >= 61 && grade <= 70){
        System.out.println("Your grade is B");
    }
    else if(grade >= 71 && grade <= 80){
        System.out.println("Your grade is B+");
    }
    else if(grade >= 81 && grade<=90){
        System.out.println("Your grade is A");
    }
    else if(grade >= 91 && grade<=100){
        System.out.println("Your grade is A+");
    }
    else{
        System.out.println("Your grade is NG");
    }
    }
}
