import java.util.Scanner;
public class ProfitLoss {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        if(sc.nextFloat() >0){
            System.out.println("The Number is Profit");
        }else if (sc.nextFloat() <0){
            System.out.println("The Number is loss");
        }else{
            System.out.println("There is no profofit or loss ");
            sc.close();
        }
  }
}
        

