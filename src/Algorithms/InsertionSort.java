package Algorithms;
public class InsertionSort {
    void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        String[] arr = {"apple", "banana", "orange", "mango", "kiwi", "pineapple", "grape",
                "strawberry", "Peach", "Pear"};
        obj.insertionSort(arr);
        for(String st: arr) System.out.print(st+" ");

    }
}