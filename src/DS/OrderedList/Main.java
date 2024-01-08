
package DS.OrderedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderedList orderedList = new OrderedList();
        try {
            File file = new File("D:\\java ge\\ds questions\\DS\\src\\DS\\OrderedList\\numbers.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                int num = Integer.parseInt(scanner.nextLine());
                orderedList.insert(num);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try (Scanner userInput = new Scanner(System.in)) {
            
            System.out.print("Enter a number: ");
            int userNumber = userInput.nextInt();
            if (orderedList.head != null) {
                Node temp = orderedList.head;
                boolean found = false;
                while (temp != null) {
                    if (temp.data == userNumber) {
                        orderedList.delete(userNumber);
                        found = true;
                        break;
                    }
                    temp = temp.next;
                }
                if (!found) {
                    orderedList.insert(userNumber);
                }
            } else {
                orderedList.insert(userNumber);
            }
        }

        orderedList.displayList();

        orderedList.writeToFile("D:\\java ge\\ds questions\\DS\\src\\DS\\OrderedList\\numbers.txt");  
    }
}