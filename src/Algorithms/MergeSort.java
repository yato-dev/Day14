
package Algorithms;
public class MergeSort {
   
    public void mergesort(String arr[], int l, int r) {
        if(r-l<=1) return;
        if(l<r) {
            int mid = l + (r - l) / 2;
           
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);

           
            merge(arr, l, mid, r);
        }
    }
  
    public void merge(String arr[], int l, int mid, int r) {
    
        int n1 = mid - l + 1;
      
        int n2 = r - mid;
      
        String[] temp1 = new String[n1];
        String[] temp2 = new String[n2];
        int k = l;
        for (int i = 0; i < n1; i++) {
            temp1[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            temp2[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if ((temp2[j].compareTo(temp1[i]))>=0 ) {
                arr[k++] = temp1[i++];
            } else {
                arr[k++] = temp2[j++];
            }
        }
        while (i < n1) {
            arr[k++] = temp1[i++];
        }
        while (j < n2) arr[k++] = temp2[j++];
    }

    public static void main(String[] args) {
      MergeSort mg= new MergeSort();
        String[] arr = {"apple", "banana", "orange", "mango", "kiwi", "pineapple", "grape",
                "strawberry", "Peach", "Pear"};
      mg.mergesort(arr,0, arr.length-1);
      for(String i:arr) System.out.print(i+" ");  // Peach Pear apple banana mango kiwi orange pineapple grape strawberry
    }
}