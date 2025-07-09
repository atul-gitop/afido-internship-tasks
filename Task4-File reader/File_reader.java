import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class File_reader {

    public static void main(String[] args){

        File file = new File("out/production/Demo/textfile/welcome"); //path address is given for intellij idea

        System.out.println(file.exists());

        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){

                System.out.println(sc.nextLine());
            }
            sc.close();
        }

        catch (IOException e) {
            System.out.println("you can read above");
            }
    }
}
