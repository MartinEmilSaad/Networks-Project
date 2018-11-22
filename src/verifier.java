import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by Martin on 11/22/2018.
 */
public class verifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String receivedMessage = scanner.nextLine();
        String divisor = scanner.nextLine();

        Generator0 generator0 = new Generator0(receivedMessage, divisor);

        String verified = new String();

        for (int i=0; i<divisor.length()-1; i++){
            verified += "0";
        }

        if(generator0.getCRC().length()== verified.length()){
            System.out.println("message is correct");
            String default_path = new String(System.getProperty("user.dir"));

            File file = new File(default_path+"/transmitted_message.txt");
            try {
                Boolean s = file.createNewFile() ;
            }
           catch (Exception io){
               System.out.println("Error while creating file");
           }

            try( FileWriter fw = new FileWriter(file) ){
                fw.write(receivedMessage+generator0.getCRC());
            }catch (Exception e)
            {
                System.out.println("sth wrong");
            }
        }

        else
            System.out.println(receivedMessage + "         "+divisor);


    }

    }
