import java.util.Scanner;
public class Sec {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum = a+b;
        int mul = a*b;
        int sub = a-b;
        System.out.println("addition is :" +sum);
        System.out.println("subtraction is " +sub);
        System.out.println("multiplication is"+mul);
        
    }
}
