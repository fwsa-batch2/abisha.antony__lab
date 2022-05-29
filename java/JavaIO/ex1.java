package JavaIO;

import java.io.File;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) throws IOException {
        File my = new File("c://io//example.txt");
        if(my.createNewFile()){
            System.out.println("ok");
        }
        else{
            System.out.println("not ok");
        }
    }
}
