interface inter{
//  public String a = "venky";
   void meth();
   void od(); 
}
class face implements inter{
     public void meth(){
        System.out.println("venky i am a monkey");  
    }
    public void od(){
        System.out.println("swetha is a fraud");
    }
}
public class interfaces {
    public static void main(String[] args) {
        face sv = new face();
        sv.od();
    }
}
