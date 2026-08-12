public class Main {
    public int addValue(){
        int a =5; int b =8;
        int sum = a+b;
        return sum;

    }
    public static void main(String[] args){
        Main obj = new Main();
        int res = obj.addValue();
        System.out.println("res:"+res);
    }
}
