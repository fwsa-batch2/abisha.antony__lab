package STRING;

public class split {
    public static void main(String[] args) {
        String a = "lady hitler ";
        String[] mylist = a.split(" ",1);
        for(String b: mylist){
            System.out.println(b);
        }
    }
    
}
