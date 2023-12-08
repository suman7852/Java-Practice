import java.util.*;
public class oddEven {
    public static void main(String[] args) {
        System.out.println("Enter the number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n%2 == 0){
            System.out.println("n is an even number");
        }
        else{
            System.out.println("n is an odd number");
        }
    }
}
