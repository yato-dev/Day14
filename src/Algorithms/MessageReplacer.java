
package Algorithms;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MessageReplacer {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the message: ");
            String message= sc.nextLine();

            
            String name="Vivek";
            String fullName="Vivek Ranjan";
            String phoneNo="91-1234567890";
            String date=CurrentDate();

      
            String nameRegex= "<<name>>";
            String fullNameRegex="<<full name>>";
            String phoneRegex="91-\\w{10}";
            String dateRegex="\\d{2}/\\d{2}/\\d{4}";

            
            message=message.replaceAll(nameRegex,name);
            message=message.replaceAll(fullNameRegex,fullName);
            message=message.replaceAll(phoneRegex,phoneNo);
            message=message.replaceAll(dateRegex,date);

            System.out.println("Modified Message : ");
            System.out.println(message);
        }

    }
   
    public  static String CurrentDate(){
        LocalDate currdate= LocalDate.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return formatter.format(currdate);
    }
}
