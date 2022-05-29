package JavaIO;

import java.io.File;
import java.io.IOException;

public class ex2 {
    public static void main(String[] args) throws IOException {
        File ny = new File("c://io//example2.txt");
        if(ny.createNewFile()){
            System.out.println("run");
        }
        else{
            System.out.println("null");
        }
    }
}
