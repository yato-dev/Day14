package Algorithms;
import java.util.Scanner;
public class FindNumber {
   
    int  guessNumber(int low,int high,Scanner scanner){
        if(low==high) return low;
        if(low>high) return -1;
        int mid= low+(high-low)/2;
        System.out.println("Press true if your number is between "+low+" and "+mid +" else false");
        boolean response= scanner.nextBoolean();
        if(response){
          return  guessNumber(low,mid,scanner);
        }
        else return guessNumber(mid+1,high,scanner);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Type Number: ");
        int n= scanner.nextInt();
        int range= (int) Math.pow(2,n);
        FindNumber fn= new FindNumber();
        System.out.println(fn.guessNumber(0,range-1,scanner));
    }
}
