package JavaIO;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOinJava {
    public static void main(String[] args) throws IOException {
//        File newFile = new File("D:\\output\\new\\");
//        if(newFile.createNewFile()){
//            System.out.println("created");
//        } else{
//            System.out.println("not");
//        }

//        FileWriter mfw = new FileWriter("D:\\output\\abi1.txt");
//        mfw.write("abi loosu");
//        mfw.close();

//        File read = new File("D:\\output\\abi1.txt");
//        Scanner scan = new Scanner(read);
//        while (scan.hasNext()){
//            System.out.println(scan.nextLine());
//        }

        File newDir = new File("D:\\output\\test");
        if(newDir.mkdir()){
            System.out.println("created");
        } else{
            System.out.println("not");
        }
    }
}