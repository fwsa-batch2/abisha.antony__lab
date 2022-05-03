class parent{
    void method1(){
        System.out.println("i am the parent");
    }
}
class son1 extends parent{
    void method2(){
        System.out.println("first son");
    }
}
class son2 extends parent{
    void method3(){
        System.out.println("second son");
    }
}
class son3 extends parent{
    void method4(){
        System.out.println("third son");
    }
}
public class hierarchial {
    public static void main(String[] args) {
        son1 obj1 = new son1();
        son2 obj2 = new son2();
        son3 obj3 = new son3();
       obj1.method1();
        obj1.method2();
        obj2.method3();
        obj3.method4();
    }
}
