import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a%100;
        int d = b%100;
        if(c == d){
            System.out.println("Both years has same last digit");
        }
        else {
            System.out.println("Both years has diff last digit");
        }
    }
}