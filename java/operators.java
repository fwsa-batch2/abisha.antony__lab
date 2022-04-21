import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner add = new Scanner(System.in);
        int num1 = add.nextInt();

        System.out.println("Enter second number");
        Scanner mul = new Scanner(System.in);
        int num2 = mul.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

    }
    
}
