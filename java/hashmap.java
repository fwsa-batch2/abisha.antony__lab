
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String>numbers = new HashMap<>();

        numbers.put(1,"Swedha");
        numbers.put(2,"Nandhitha");
        numbers.put(3,"Aswathy");
        numbers.put(4,"Abisha");

        
        System.out.println(numbers.keySet());
        System.out.println(numbers.values());
        System.out.println(numbers.entrySet());
        System.out.println(numbers.remove(4));
        System.out.println("Map" + numbers);


    }
}
