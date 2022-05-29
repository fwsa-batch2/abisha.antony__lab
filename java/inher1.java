import java.io.*;
import java.util.*;

class Animal{
    void walk(){
        System.out.println("I am walking");
    }

}
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void Sing(){
        System.out.println("I am singing");
    }
}
public class inher1 {

    public static void main(String[] args) {
        Bird sc = new Bird();
        sc.walk();
        sc.fly();
        sc.Sing();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
