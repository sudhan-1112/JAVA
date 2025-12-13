import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        double r=sc.nextDouble();
        double peric=2*3.14*r;
        System.out.println("Perimeter of Circle "+peric);
    }
}