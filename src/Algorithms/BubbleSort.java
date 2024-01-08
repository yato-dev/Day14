
package Algorithms;
public class BubbleSort {
    public static void main(String[] args) {
        String[] arr={"apple", "banana", "orange", "mango", "kiwi", "pineapple", "grape",
                "strawberry" ,"Peach","Pear"};
        arr=bubbleSort(arr);
        for(String st:arr) System.out.print(st+" ");
        
    }
  
    public static String[] bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { 
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
