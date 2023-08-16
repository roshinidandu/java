import java.util.Arrays;
import java.util.Scanner;

public class Arraysort {
    public static void main(String[] args){
        int [] sort=new int[4];
        Scanner S=new Scanner(System.in);
        System.out.println("Array values");
        for(int i =0;i<4;i++){
            sort[i]=S.nextInt();
        }
        Arrays.sort(sort);
        System.out.println(sort);
        for(int i=0;i<4;i++){
            System.out.println(sort[i]);
        }
    }
}
