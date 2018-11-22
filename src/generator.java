

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by Martin on 11/22/2018.
 */
public class generator {


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String divisor = scanner.nextLine();

        Generator0 generator0 = new Generator0(message, divisor);

        System.out.println(message+generator0.getCRC());
        System.out.println(divisor);


        String default_path = new String(System.getProperty("user.dir"));
        File file = new File(default_path+"/transmitted_message.txt");

        try( FileWriter fw = new FileWriter(file) ){
            fw.write(message+generator0.getCRC());
        }catch (Exception e)
        {
            System.out.println("sth wrong");
        }

    }


}
