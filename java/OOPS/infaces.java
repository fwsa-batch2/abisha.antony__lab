package OOPS;

interface myInterface{
    void func();
}
class myClassExample implements myInterface{
    public void func(){
        System.out.println("Abisha6");
    }
}
public class infaces{
    public static void main(String[] args) {
        myClassExample obj = new myClassExample();
        obj.func();
    }
}