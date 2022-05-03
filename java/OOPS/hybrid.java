class A{
    void name(){
    String var = "abi";
    System.out.println(var);
    }
}
class B extends A{
    void name2(){
        System.out.println("class B");
    }
}
class C extends A{
    void name3(){
        System.out.println("class C");
    }
}
class D extends B{
    void name4(){
        System.out.println("class D");
    }
}
public class hybrid {
   public static void main(String[] args) {
       
       B obj2 = new B();
       C obj3 = new C();
       D obj4 = new D();

       obj2.name2();
       obj2.name();
    
    
    
    } 
}
