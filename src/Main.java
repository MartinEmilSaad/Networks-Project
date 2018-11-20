import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String stringData = new String();
        String stringGenerator = new String();



        stringData = "11100000101000011011101"; //E100CAFE
        stringGenerator = "1001100011";



        Generator generator = new Generator(stringData, stringGenerator);

        System.out.println(generator.getCRC());


    }


}








