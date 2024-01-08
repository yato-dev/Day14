
package DS.BankingCash;
public class BankingCash {
    static int cashBalance = 10000;
   
    public static void deposit(Queue queue, int amount) {
        cashBalance += amount;
        System.out.println("Deposited: $" + amount + " | Cash Balance: $" + cashBalance);

    }
  
    public static void withdraw(Queue queue, int amount) {
        if (cashBalance >= amount) {
            cashBalance -= amount;
            System.out.println("Withdrawn: $" + amount + " | Cash Balance: $" + cashBalance);
        } else {
            System.out.println("Insufficient funds!");
        }

    }

    public static void main(String[] args) {
        Queue queue = new Queue(10); 

      
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3); 

        while (!queue.isEmpty()) {
            int choice = queue.dequeue();
            if (choice == 1) {
             
                int depositAmount = 500; 
                deposit(queue, depositAmount);
            } else if (choice == 2) {
               
                int withdrawAmount = 300; 
                withdraw(queue, withdrawAmount);
            } else {
                System.out.println("Invalid choice!");
            }
        }

        
    }
}
