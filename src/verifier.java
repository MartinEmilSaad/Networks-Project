import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by Martin on 11/22/2018.
 */
public class verifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String receivedMessage = new String();
        String divisor= new String();

        if(scanner.hasNext()==true)
          receivedMessage = scanner.nextLine();

        if(scanner.hasNext()==true)
         divisor = scanner.nextLine();

        Generator0 generator0 = new Generator0(receivedMessage, divisor);

        String verified = new String();

        for (int i=0; i<divisor.length()-1; i++){
            verified += "0";
        }

        if(generator0.getCRC().equals(verified))
            System.out.println("message is correct");

        else
            System.out.println("Messege isn't correct");


    }

    }
