import java.util.Scanner;

public class alter {

    public static void main(String[] args) {

        String bitNumber = args[0];

        Scanner scanner = new Scanner(System.in);

        String receivedMessage = scanner.nextLine().toString();
        String divisor = scanner.nextLine().toString();



        int bitNo = Integer.parseInt(bitNumber);

        System.out.println(bitNo);


        if(receivedMessage.charAt(bitNo) == '1')
        { receivedMessage = receivedMessage.substring(0, bitNo-1) + "0"+ receivedMessage.substring(bitNo); }
        else
        {  receivedMessage = receivedMessage.substring(0, 1) + "1"+ receivedMessage.substring(bitNo); }

        System.out.println(receivedMessage);
        System.out.println(divisor);

    }


}
