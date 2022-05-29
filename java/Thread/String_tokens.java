import java.sql.SQLOutput;
import java.util.Scanner;

public class String_tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string :");
        scan.useDelimiter("\\Z");
        String s = scan.next().trim();
        System.out.println(s.length());

        if (s.length() > 0) {
            String[] tokens = s.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for(String token : tokens) {
                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }
        scan.close();
    }

}
