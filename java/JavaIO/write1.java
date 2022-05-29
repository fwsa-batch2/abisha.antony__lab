package JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class write1 {
    public static void main(String[] args) throws IOException {
        FileWriter wrt = new FileWriter("c://io//example.txt");
        wrt.write("welcome");
        wrt.close();
        System.out.println("null");

    }
}
