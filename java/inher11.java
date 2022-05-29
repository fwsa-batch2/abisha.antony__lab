class Arithmetic{
    public int add(int a, int b){
     return a+b;
    }

}
class Adder extends Arithmetic{

}
public class inher11 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder obj = new Adder();
        System.out.println("My Superclass is :"+obj.getClass().getSuperclass().toString());

        System.out.println(obj.add(4, 5));
    }
}
