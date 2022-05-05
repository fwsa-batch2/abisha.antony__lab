import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        System.out.println("Enter first number");
        
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
      
        // Scanner inp1 = new Scanner(System.in);
        int b = inp.nextInt();
        int tot = a *b;
        System.out.println(tot);


    }
}