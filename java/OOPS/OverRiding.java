class Parent{
   void over(){
       System.out.println("over riding");
   }
}
class Child {
    void over(){ 
        System.out.println("over riding here");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.over();
    }
}
