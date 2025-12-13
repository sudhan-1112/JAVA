import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        double perit=(l+b+h);
        System.out.println("Perimeter of Rectangle "+perit);
    }
}