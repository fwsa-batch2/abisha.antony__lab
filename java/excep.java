import java.util.Scanner;

public class excep {
    public static void main(String[] args) {
        try {
        Scanner scan = new Scanner(System.in);
       int sc = scan.nextInt();
        int str = scan.nextInt();

            System.out.println(sc / str);

        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
