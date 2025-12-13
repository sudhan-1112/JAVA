import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        boolean ooe=(n1==n2)?true:false;
        System.out.println("Equal or Not: "+ooe);
    }
}