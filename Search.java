//Reservation Search in Text File

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationSearch {

    public static void main(String[] args) {
        System.out.println("What is the Reservation ID number?");
        reservationID = Scanner.nextInt();  
        int reservationID; // Example reservation ID
        String filePath = "reservations.txt"; // Path to the text file
        searchReservation(filePath, reservationID);
    }

    public static void searchReservation(String filePath, int reservationID) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (Integer.parseInt(details[0]) == reservationID) {
                    String name = details[1];
                    Date stayDates = new SimpleDateFormat("MM-dd-yyyy").parse(details[2]);
                    String roomType = details[3];
                    int guests = Integer.parseInt(details[4]);

                    System.out.println("Name: " + name);
                    System.out.println("Stay Dates: " + stayDates);
                    System.out.println("Room Type: " + roomType);
                    System.out.println("Number of Guests: " + guests);
                    return;
                }
            }
            System.out.println("Reservation ID not found.");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
