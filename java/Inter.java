interface myInter{
    void sys();
}
class myClass implements myInter{
    public void sys(){
        System.out.println("This is owrking");
    }
}
public class Inter {
    public static void main(String[] args) {
        myClass mc = new myClass();
        mc.sys();
    }
}
