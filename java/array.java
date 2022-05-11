import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] mylist =  {1,2,3,4,5,} ;
        int arraylength = mylist.length;
        Arrays.sort(mylist);
        System.out.println(mylist[0]);
        System.out.println(mylist[arraylength-1]);
        

        
    }
    
}
