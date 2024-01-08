package DS.OrderedList;
import java.io.*;
class OrderedList {
    Node head;
    OrderedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) { 
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    void delete(int data) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == data) { 
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found in the list.");
            return;
        }
        prev.next = temp.next;
    }
    
    void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    void writeToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Node current = head;
            while (current != null) {
                bufferedWriter.write(String.valueOf(current.data));
                bufferedWriter.newLine();
                current = current.next;
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}


