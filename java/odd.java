import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Enter the number");
        Scanner odd = new Scanner(System.in);
        int num = odd.nextInt();
        while(i<= num){
            System.out.println(i);
            i = i+3;
        }
        odd.close();

    }
}
