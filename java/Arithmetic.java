import java.io.*;
import java.util.*;
interface AdvancedArithmetic {
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
    int divisor_sum(int n){
        int ans=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                ans = i+ans;
            }
        }
        return ans;
    }
}
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        MyCalculator obj=new MyCalculator();
        System.out.println("I implemented :"+obj.getClass().getInterfaces()[0].getSimpleName());
        System.out.println(obj.divisor_sum(n));
    }
}