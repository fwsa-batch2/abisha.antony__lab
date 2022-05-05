import java.util.Scanner;

public class scannerexamples {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int d = a + b * c;
        System.out.println(d);

    }
}
