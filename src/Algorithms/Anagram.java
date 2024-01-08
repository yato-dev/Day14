package Algorithms;
import java.util.Arrays;

public class Anagram {
    boolean checker(String str1, String str2) {
        char[] temp1 = str1.toCharArray();
        char[] temp2 = str2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if(temp1.length!=temp2.length) return false;
        for(int i=0;i<temp1.length;i++){
            if(temp1[i]!=temp2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Anagram ag= new Anagram();
        System.out.println(ag.checker("abcd","dcba")); // true
        System.out.println(ag.checker("aaab","baaa")); // true
        System.out.println(ag.checker("aabb","baba")); // true
        System.out.println(ag.checker("aabba","bababa")); // false
        System.out.println(ag.checker("hence","encfh"));  // false

    }
}