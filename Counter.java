import java.util.*;
public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Counters are");
        for(int counter =0; counter<=n; counter++){
            System.out.println(counter);
        }
        int i=2;
        System.out.println("Count of i");
        while(i<n){
            System.out.println(2*i);
            i++;
        }
    }
}
