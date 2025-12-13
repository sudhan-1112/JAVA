import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        double a=sc.nextDouble();
        System.out.println("Surface Area: "+6*a*a);
        System.out.println("Volume: "+a*a*a);
        System.out.println("Perimeter of Cube: "+12*a);
    }
}