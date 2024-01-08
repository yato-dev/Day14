
package Algorithms;
import java.util.ArrayList;
public class StringPermutaion {
    public static void main(String[] args) {
        String st="abc";
      ArrayList<String> RecRes= recPermutation("abc",0,2);
        System.out.println(RecRes);
        ArrayList<String> IterRes=iterativePermutation(st);
        System.out.println(IterRes);
        System.out.println(IterRes.equals(RecRes));
    }
  
    public static ArrayList<String> recPermutation(String st,int l,int r){
      ArrayList<String> result= new ArrayList<>();
      if(l==r) {
          result.add(st);
          return result;
      }
      else{
          for(int i=l;i<=r;i++){
              char[] chararray= st.toCharArray();
              char temp= chararray[i];
              chararray[i]=chararray[l];
              chararray[l]=temp;
              result.addAll(recPermutation(String.valueOf(chararray),l+1,r));
          }
      }
      return result;
    }
  
    public static  ArrayList<String> iterativePermutation(String str){
        ArrayList<String> result= new ArrayList<>();
        result.add("");
        for(char ch: str.toCharArray()){
            ArrayList<String> current = new ArrayList<>();
            for(String st: result) {
                for (int i = 0; i <= st.length(); i++) {
                    String temp = st.substring(0, i) + ch + st.substring(i);
                    current.add(temp);
                }
            }
            result=current;
        }
        return result;
    }
}
