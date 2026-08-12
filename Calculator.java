import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        float a = sc. nextFloat();
        System.out.println("Select Operator:");
        char ch = sc.next().charAt(0);
        System.out.println("Enter b:");
        float b= sc.nextFloat();
        switch(ch) {
            case '+':
            System.out.println("sum: " +(a+b));
            break;
            case '-':
            System.out.println("sum: " +(a-b));
            break;
            case '*':
            System.out.println("sum: " +(a*b));
            break;
            case '/':
            System.out.println("sum: " +(a/b));
            break;
            default:
            System.out.println("Invaild");
            break;
        

        }
       sc.close();
    }
}
