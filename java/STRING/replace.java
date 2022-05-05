package STRING;

public class replace {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("test");
        str.replace(0, 2, "FA");
        System.out.println(str);
    }
    
}
