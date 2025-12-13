import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        System.out.println("Surface Area: "+(2*(l*b+b*h+l*h)));
        System.out.println("Volume: "+l*b*h);
    }
}