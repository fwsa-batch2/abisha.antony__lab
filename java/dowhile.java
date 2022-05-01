import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
       System.out.println("Enter a Number"); 
       Scanner scan=new Scanner(System.in);
       int no=scan.nextInt();
       int i=1;
       do {
          System.out.println(i);
          i=i+2;
        }while(i<=no);
        scan.close();
    }
}
