
package Algorithms;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Task{
    public  int deadline;
    public int duration;
    public Task(int deadline,int duration){
        this.deadline=deadline;
        this.duration=duration;
    }
}
public class TaskScheduling {
 
     
     public static int minimiseOvershoot(Task[] tasks){
          Arrays.sort(tasks, Comparator.comparingInt(t->t.deadline));
          int currentTime=0;
          int maxOvershoot=0;
          for(Task t:tasks){
              currentTime+=t.duration;
              int overshootTime= Math.max(0,currentTime-t.deadline);
              maxOvershoot=Math.max(maxOvershoot,overshootTime);
          }
          return maxOvershoot;
     }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter number of Tasks: ");
            int n= sc.nextInt();
            Task[] tasks;
            tasks= new Task[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the deadline of task"+(i+1));
                int dl= sc.nextInt();
                System.out.println("Enter the duration of  task"+(i+1));
                int dr= sc.nextInt();
                Task currtask= new Task(dl,dr);
                tasks[i]=currtask;
            }
            System.out.println(minimiseOvershoot(tasks));
        }
    }
}
