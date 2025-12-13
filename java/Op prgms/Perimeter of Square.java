import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        double s=sc.nextDouble();
        double peris=(4*s);
        System.out.println("Perimeter of Square"+peris);
    }
}