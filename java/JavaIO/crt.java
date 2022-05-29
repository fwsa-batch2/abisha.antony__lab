package JavaIO;

import java.io.File;
import java.io.IOException;

public class crt {
    public static void main(String[] args) throws IOException {
        File fname = new File("D://output//ex.txt");
        if(fname.createNewFile()){
            System.out.println("created");
        }
        else{
            System.out.println("not");
        }

    }
}
