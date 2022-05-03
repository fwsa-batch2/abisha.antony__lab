abstract class example {
    abstract void name();
}

class sum extends example {
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
