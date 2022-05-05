import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        if(n%2 == 1){
            System.out.println("weird");
        }
        else if(n%2 == 0 && (n>=2)&&(n>=5)){
           System.out.println("not weird");
        }
        else if(n%2 == 0 && (n>=6)&&(n<=20)){
            System.out.println("weird");
        }
        else if(n%2 == 0 && (n >= 20)){
            System.out.println("not weird");
        }
        else{
            System.out.println();
        }
    }
    
}
