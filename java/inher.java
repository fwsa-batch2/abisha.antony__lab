import javax.sound.sampled.SourceDataLine;

class superclass{
    String name = "buffalo";
}
class  subclass extends superclass{
    int year = 1998;
    public void ex(){
        System.out.println(super.name);
    }
    
}
 public class inher{
    public static void main(String[] args) {
        subclass obj = new subclass();
        System.out.println(obj.year);
        obj.ex();
    }
 }

 



    

