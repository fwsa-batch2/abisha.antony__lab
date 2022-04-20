import java.util.Arrays;
import java.util.List;

public class aver {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5);
         int var = 0;
         for(int i = 0;i < myList.size();i++){
               var = var + myList.get(i);
               
         }
         int avg = var / myList.size();
         System.out.println(avg);


    }
}
