import java.util.Locale;
import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.length()+b.length());
//        System.out.println(a.compareTo(b));
      if(a.compareTo(b)>0){
          System.out.println("yes");
      }
      else {
          System.out.println("no");
      }
        System.out.println(a.substring(0,1).toUpperCase()+ a.substring(1,a.length()) + " "+ b.substring(0,1).toUpperCase() + b.substring(1,b.length()));
    }
}
