package OOPS;

class first{
    void func1(){
        System.out.println("working 1");
    }
}
class second extends first{
    void func2(){
        System.out.println("Working 2");
    }
}
class third extends second{
    void func3(){
        System.out.println("working 3");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        third obj = new third();
        obj.func1();
        obj.func2();
        obj.func3();
    }
}
