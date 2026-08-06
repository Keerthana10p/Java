import java.util.Scanner;
public class PrintTheirAverage {
    public static void main (String[] args){
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1:");
        float num1 = sc.nextFloat();
         System.out.println("Enter the num 2:");
        float num2 = sc.nextFloat();
         System.out.println("Enter the num 3:");
        float num3 = sc.nextFloat();
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("The average is: " + average);


    
}
}
