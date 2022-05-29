import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class bigint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SortedSet<Object> a = new TreeSet<>();
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        System.out.println(a);
//        for(int j=0; j<a.size(); j++){
//            System.out.println();
//        }

    }
}
