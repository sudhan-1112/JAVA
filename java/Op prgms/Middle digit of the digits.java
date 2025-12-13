import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        int middle = (n / 10) % 10;  
        System.out.println("Middle digit: " + middle);
    }
}
