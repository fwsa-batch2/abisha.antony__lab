package JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class wrt2 {
    public static void main(String[] args) throws IOException {
        FileWriter myfile = new FileWriter("c://io//example.txt");
        myfile.append("pakki");
        myfile.close();

    }
}
