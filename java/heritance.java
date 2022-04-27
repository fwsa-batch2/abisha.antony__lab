import java.nio.channels.GatheringByteChannel;

class human{
    String  var1 = "jeru";
}
class girl extends human{
    int age = 19;
    public void method(){
        System.out.println(super.var1);
    }
    
}
class girl1 extends girl{
    String color = "white"; 
}
public class heritance {
    public static void main(String[] args) {
       girl obj = new girl();
       girl1 obj1 = new girl1();
       System.out.println(obj.var1);
       System.out.println(obj.age);
       System.out.println(obj1.color);
       obj.method();
    }
    
}
