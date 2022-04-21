import java.io.Reader;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner fst = new Scanner(System.in);
        int num1 = fst.nextInt();
 
        System.out.println("Enter second number");
        Scanner sec = new Scanner(System.in);
        int num2 = sec.nextInt();

        System.out.println("Enter the operation");
        Scanner opp = new Scanner(System.in);
        String add1 = opp.nextLine();

       
         switch(add1){
             case "+":
             System.out.println("sum of the values "+ (num1 + num2));
             break;

             case "-":
             System.out.println("subtraction of the values  " + (num1 - num2));
             break;

             case "*":
             System.out.println("multiplication of the values " + (num1*num2) );
             break;

             case "/":
             System.out.println("divison of the two values " + (num1/num2));
             break;
         }
        

    }
    
}
