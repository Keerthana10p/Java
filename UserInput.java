import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter your department:");
        String department = sc.nextLine();
        System.out.println("Enter your CGPA:");
        float CGPA = sc.nextFloat();
        System.out.println("Enter Your register Number:");
        long register_number = sc.nextLong();
        System.out.println("Enter your phone number:");
        long phone_number = sc.nextLong();
        sc.close();

        System.out.println("name:" + name);
        System.out.println("register number:" + register_number);
        System.out.println("department:" + department);
        System.out.println("CGPA:" + CGPA);
        System.out.println("phone number:" + phone_number);

    }
}
