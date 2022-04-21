import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner num1 = new Scanner(System.in);
        int no1 = num1.nextInt();

        System.out.println("enter second number");
        Scanner num2 = new Scanner(System.in);
        int no2 = num2.nextInt();

        System.out.println("Addition of the values " + add(no1,no2));
        System.out.println("subtraction of the values " + sub(no1,no2));
        System.out.println("multiplication of the values " + mul(no1,no2));
        System.out.println("division of the values " + div(no1,no2));

    }
    public static int add(int x,int y){
        return x+y;
    }
    public static int sub(int x,int y){
        return x-y;
    }
    public static int mul(int x,int y){
        return x*y;
    }
    public static float div(float x,float y){
        return x/y;
    }
}
