import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        System.out.println("Surface Area: "+(2*3.14*r*(h+r)));
        System.out.println("Volume: "+ 3.14*r*r*h);
    }
}