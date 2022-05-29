import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class anagex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] ch = a.toCharArray();
        char[] ar = b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ar);
        String ab = new String(ch);
        String bc = new String(ar);
        if (ab.equals(bc)){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not anagrams");
        }

    }
}
