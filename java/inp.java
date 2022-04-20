import java.util.Scanner;

public class inp {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner inp = new Scanner(System.in);
        int num1 = inp.nextInt();
        System.out.println("Enter second number");
        Scanner out = new Scanner(System.in);
        int num2 = inp.nextInt();
        int result =   num1 * num2;
        System.out.println(result);

    }
    
}
