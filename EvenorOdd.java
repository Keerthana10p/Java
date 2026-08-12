import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        if (sc.nextFloat() % 2 == 0) {
            System.out.println("The given Number is Even");
        } else {
            System.out.println("The given Number is Odd");
        }
        sc.close();
    }
}
        

