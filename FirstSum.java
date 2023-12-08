import java.util.*;
public class FirstSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int sum =0;
        for(int i = 0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Sum of first n natural number");
        System.out.println(sum);
    }
}
