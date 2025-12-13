import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Celsius: ");
        double celsi=sc.nextDouble();
        double faren=(celsi*9/5)+32;
        System.out.println("Farenheit is "+faren);
    }
}