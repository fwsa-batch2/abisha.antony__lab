interface myInter{
    void func();
}
class myClass implements myInter{
    public void func(){
        System.out.println("Abisha6");
    }
}
public class infaces{
    public static void main(String[] args) {
        myClass obj = new myClass();
        obj.func();
    }
}