import java.util.Scanner;

/**
 * Created by Martin on 11/21/2018.
 */
public class commands {

   public enum file_type {verifier , alter} ;

    private String  command_text ;
   file_type type ;



    public commands(String command_text, file_type type) {

        this.command_text = command_text;
        this.type = type;
    }

    public commands(String command_text) {
        this.command_text = command_text;
        check_command_type();
    }

    public file_type getType() {
        return type;
    }

    public void setType(file_type type) {
        this.type = type;
    }

    public String getCommand_text() {
        return command_text;
    }

    public void setCommand_text(String command_text) {
        this.command_text = command_text;
        check_command_type();
    }



    public void check_command_type(){
       if(command_text.contains("verifier"))
           type = file_type.alter ;

       else
           type = file_type.verifier ;
   }




}
