package Algorithms.BinarySearch;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args){
        File file = new File("src\\Algorithms\\BinarySearch\\words.txt");

        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String str;
                String[] arr= new String[100];
                int cnt=0;
                while ((str = br.readLine()) != null) {
                    for (String st : str.split(",")) {
                        st=st.trim();
                        if(cnt==arr.length){
                            arr=Arrays.copyOf(arr,2*arr.length);
                        }
                    arr[cnt++]=st;
                    }
                }
         arr= Arrays.copyOf(arr,cnt);
                Arrays.sort(arr);
                System.out.println("Index of kiwi is: "+binarySearch(arr,"kiwi"));    // 5
                System.out.println("Index of banana is: "+binarySearch(arr,"banana"));  // 3
                System.out.println("Index of Flower is: "+binarySearch(arr,"Flower"));  //-1
            }
        }
        catch(Exception e){
            System.out.println("File not Found");
        }
    }
    
    public static int binarySearch(String[] words,String target){
        int left=0,right= words.length-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            int comparison= target.compareTo(words[mid]);

            if(comparison==0) return mid;
            else if(comparison>0) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}
