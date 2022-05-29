package JavaIO;

import java.io.*;
import java.util.Scanner;

public class ReadWithIO {
    public static void main(String[] args) throws IOException {
        File read = new File("D:\\output\\abi1.text");
        Scanner scan = new Scanner(read);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

    }
}
