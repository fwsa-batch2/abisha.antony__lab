import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class anag {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        String b = str.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        String outa = new String(ca);
        String outb = new String(cb);

        if (outa.equals(outb)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

}
