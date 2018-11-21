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
       if(command_text.contains("alter"))
           type = file_type.alter ;

       else
           type = file_type.verifier ;
   }
   /*
   public boolean is_command_true() {
       if (command_text.substring(0, 8).equals("generate ")) {
           //check the rest
           if(type==file_type.verifier){
               int index = command_text.indexOf('|') ;
               if(command_text.substring(index+1 , index+6).equals("verify"))
                   return true ;
               else return false;
           }
           else{
               int index = command_text.indexOf('|') ;
               if(command_text.substring(index+1 , index+))
           }
       } else return false;
   }
   */

   public boolean is_number(char i){
       if(i=='0'|i=='1'||i=='2'||i=='3'||i=='4'||i=='5'||i=='6'||i=='7'||i=='8'||i=='9')
           return true ;
       else return false ;
   }

   public int index_of_altered(){
       int index = command_text.indexOf("alter") ;
       index += 6 ;
       String number = new String("") ;
      while(is_number(command_text.charAt(index))){
          number += command_text.charAt(index) ;
          index++;
      }
      return Integer.parseInt(number) ;
   }

}
