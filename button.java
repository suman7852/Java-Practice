import java.util.*;
public class button {
    public static void main(String[] args) {
        System.out.println("Enter button");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            default:
            System.out.println("Invalid button");
        }
    }
}
