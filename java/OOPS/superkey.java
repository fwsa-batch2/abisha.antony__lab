class big{
    int num = 19;
}
class some extends big{
    int num = 10;
    public void func(){
        System.out.println(super.num);
    }
}
public class superkey{
    public static void main(String[] args) {
        some obj = new some();
        obj.func();
    }
}