package STRING;

public class ensurecapacity {
    public static void main(String[] args) {
        
    
    StringBuffer a = new StringBuffer();
    System.out.println(a.capacity());
    a.append("no comments simply waste");
    System.out.println(a.capacity());
    a.ensureCapacity(35);
    System.out.println(a.capacity());
    }
}
