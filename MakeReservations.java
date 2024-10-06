
import java.util.*;
import java.io.*;


public class MakeReservations {

    public static String ConfirmCode(int num){
        String AlphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder code = new StringBuilder(num);
        for (int i = 0; i< num; i++){
            int index = (int) (AlphabetString.length()* Math.random());
            code.append(AlphabetString.charAt(index));
        }
        return code.toString();
    }

    public static void main(String[] args) {
        try{
            int num = 6;
            //Account fname = getFirstName();
            //Account lname = getLastName();
            //Date resdate = getDate();
            //Room resroom = getRoom();

            String fname = "John";
            String lname = "Smith";
                    
            String code = ConfirmCode(num);
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("Reservations.txt",true));

            writer.write(fname);
            writer.newLine();
            writer.write(lname);
            writer.newLine();
            //writer.write(resdate)
            //writer.newLine();
            //writer.write(resroom);
            //writer.newLine();
            writer.write(code);
            writer.newLine();
            writer.newLine();
            writer.close();

        }catch (Exception e){System.out.printf("\n\tError occurred in trying to write to the file. %s", e);}
    }
}
