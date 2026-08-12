public class ConIFELSE {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 18) {
            System.out.println("Adult");
            if (age >=65) {
                System.out.println("Old age");
            }
        } else {
            System.out.println("Minor");
            if(age <= 12) {
                System.out.println("Child");
            
            }
        }
    }
}
