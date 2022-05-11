package STRING;

public class ensurecapacity {
    public static void main(String[] args) {
        
    
    StringBuffer a = new StringBuffer("no");
    a.append(" no");
    System.out.println(a);
    System.out.println(a.capacity());
    System.out.println(a.length());
    // a.ensureCapacity(35);
    // System.out.println(a.capacity());r
    }
}
