import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if(args.length>=1){
         //   System.out.println(args[0]);
            String default_path2 = new String(System.getProperty("user.dir"));
            File file22 = new File(default_path2+"/hey.txt");
            /*
            try {
                boolean c = file22.createNewFile();
                try( FileWriter fw = new FileWriter(file22) ){
                    fw.write(args[0]);
                }
                catch (Exception e){
                    System.out.println("Error : " + e);
                }

            }
            catch (Exception u){
                System.out.println("error");
            }
            */
        }



        String stringData = new String();
        String stringGenerator = new String();
        String path_with_colons = new String("");
        String path = new String();

        Scanner get_input = new Scanner(System.in);

        File file ;
        File output1 ;
        File output2 ;

        /*

      //  System.out.println("Inputs : ");
        //get path to file
        path_with_colons = get_input.nextLine() ;
        int index1 = path_with_colons.indexOf("");
        int index2 = path_with_colons.indexOf('"', index1+2);
        path = path_with_colons.substring(index1+1 , index2) ;
        */
        try
            {
                String default_path = new String(System.getProperty("user.dir"));
                file = new File(default_path+"/"+args[0]);
                //open file
                Scanner read_from_file = new Scanner(file);
                int i = 0 ;
                while (read_from_file.hasNextLine()) {
                    if (i==0) {
                        stringData = read_from_file.nextLine();
                        System.out.println(stringData);
                        i++;
                    }
                    else{
                        stringGenerator = read_from_file.next();
                        System.out.println(stringGenerator);
                    }
                }
                Generator generator = new Generator(stringData, stringGenerator);
                String transmitted_messege=generator.concatenate_rem_to_messege(stringData,generator.getCRC());

                System.out.println("Test Cases : ");


                Scanner scanner  =  new Scanner(System.in) ;

                int j = 0 ;

                while(true){
                    System.out.println("TC " + j);
                    ++j ;
                    System.out.print("Command : ");
                    commands command = new commands(scanner.nextLine());
                    if(command.getType()== commands.file_type.verifier){
                        //make sure file in command is the same entered (MARIO)

                        System.out.println("Expected output : ");
                        System.out.println("a.transmitted.txt  -> " + transmitted_messege);
                        //create file.txt and output transmitted messege in it
                        output1 = new File(default_path+"/transmitted_messege.txt");
                        try {
                            boolean check = output1.createNewFile();
                        }
                        catch (Exception io){
                            System.out.println("Error occurred " + io);
                        }
                        // Write to file
                        try( FileWriter fw = new FileWriter(output1) ){
                            fw.write(transmitted_messege);
                        }
                        catch (Exception e){
                            System.out.println("Error : " + e);
                        }

                        System.out.println("b.Messege -> Messege is corect");
                    }
                    else{
                        System.out.println("Expected output : ");
                        System.out.println("a.transmitted.txt  -> " + transmitted_messege);
                        System.out.println("b.Messege -> Messege isn't correct");
                    }
                }


            }
            catch (Exception io)
            {

                System.out.println("Error in file : "+ io);
            }
        }



}








