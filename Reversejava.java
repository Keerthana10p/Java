public class Reversejava {
    public int reverseNumber(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args){
        Reversejava obj = new Reversejava();
        System.out.println("Rev of 1234:"+obj.reverseNumber(1234));
        System.out.println("Rev of 567:"+obj.reverseNumber(567));
         System.out.println("Rev of 3478:"+obj.reverseNumber(3478));
    }
}
