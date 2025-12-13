import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        double r=sc.nextDouble();
        System.out.println("Surface Area: "+(4*3.14*r*r));
        System.out.println("Volume: "+4/3*3.14*r*r*r);
    }
}