import java.util.Scanner;

/**
 * Created by Martin on 11/23/2018.
 */
public class alter {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in) ;

        String manipulated_messege = new String() ;
        manipulated_messege = "" ;



       String data = scanner.nextLine() ;
       String divisor = scanner.nextLine() ;

        int bit_changed = 0 ;
        if(args.length>0)
            bit_changed = Integer.parseInt(args[0]) ;
        for(int i =0 ; i<data.length() ; i++){
            if(i==bit_changed){
                if(data.charAt(i)=='1')
                    manipulated_messege+="0" ;
                else
                    manipulated_messege += "1";
            }
            else
            {
                manipulated_messege += data.charAt(i) ;
            }
        }

        System.out.println(manipulated_messege);
        System.out.println(divisor);
    }

}
