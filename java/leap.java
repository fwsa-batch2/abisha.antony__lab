import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner leap = new Scanner(System.in);
        int year = leap.nextInt();
        if(year / 4 == 0){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
    
}
