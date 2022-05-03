
interface Abiii{
    int var = 10;
    void myFunc();
}

class Abisha implements Abiii{
    public void myFunc(){
        System.out.println("Abisha");
    }
}
public class Abs {
    public static void main(String[] args) {
        Abisha obj = new Abisha();
        obj.myFunc();
    }
}
