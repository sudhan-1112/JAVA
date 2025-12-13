import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Farenheit: ");
        double faren=sc.nextDouble();
        double celsi=(faren-32)*5/9;
        System.out.println("Celsius is "+celsi);
    }
}