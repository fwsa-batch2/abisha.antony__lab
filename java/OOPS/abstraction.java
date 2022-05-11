package OOPS;

abstract class program {
    abstract void name();
}

class sum extends program {
    public void name() {
        System.out.println("abstarction");

    }
}

public class abstraction {
    public static void main(String[] args) {
        sum obj = new sum();
        obj.name();

    }

}
