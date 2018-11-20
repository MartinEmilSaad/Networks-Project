import java.util.ArrayList;

public class Generator {

    String stringData;
    String stringGenerator ;
    String CRC;

    ArrayList<Boolean> boolData;
    ArrayList<Boolean> boolGenerator ;

    public Generator(String stringData, String stringGenerator) {
        this.stringData = stringData;
        this.stringGenerator = stringGenerator;
    }


    public String getCRC(){

        boolData = new ArrayList<>();
        boolGenerator = new ArrayList<>();

        for (int k = 0; k < stringData.length(); k++) {

        if(stringData.charAt(k)== '1')
            boolData.add(true);

        else
            boolData.add(false);

    }

        for (int k = 0; k < stringGenerator.length()-1; k++) {
        boolData.add(false);

    }

        for (int k = 0; k < stringGenerator.length(); k++) {

        if(stringGenerator.charAt(k)== '1')
            boolGenerator.add(true);

        else
            boolGenerator.add(false);

    }


    int i=0, j=0;

        while(  ((boolData.size()-(i))>= boolGenerator.size()) )
    {
        for(j=i; j< i+boolGenerator.size(); j++)
        {
            boolean temp = boolData.get(j)^ boolGenerator.get(j-i);
            boolData.set(j, temp) ;

        }
        for(int k=i; k< boolData.size(); k++ )
        {
            if(boolData.get(k)== true)
            {
                i=k; break;
            }
            else if(k == boolData.size()-1){
                i=k;
            }

        }

    }


    CRC ="";

     for(int k=stringData.length(); k< boolData.size(); k++)
     {
       if(boolData.get(k)== true)
           CRC += "1";

       else
           CRC += "0";


     }

       return CRC;

       }


    public String  asciiToString (String input ){

        for(int k=0; k<input.length();k++){





        }



        return  "";
    }
}







