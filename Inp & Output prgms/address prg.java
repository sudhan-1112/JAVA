import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your street: ");
        String street = sc.nextLine();
        System.out.print("Enter your city: ");
        String city = sc.nextLine();
        System.out.print("Enter your country: ");
        String country = sc.nextLine();
        System.out.println("\nYour Address:");
        System.out.println(name + "\n" + street + "\n" + city + "\n" + country);
    }
}