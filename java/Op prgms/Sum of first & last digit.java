import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        int last = n % 10;      
        int first = n / 100;    
        int sum = first + last;
        System.out.println("Sum of first and last digit: " + sum);
    }
}
