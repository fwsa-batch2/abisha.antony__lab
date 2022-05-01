import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        int i = 2;
        System.out.println("Enter the number");
        Scanner even = new Scanner(System.in);
        int num = even.nextInt();
        while (i <= num) {
            System.out.println(i);
            i = i + 2;
        }
        even.close();

    }
}
