import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String num=n<0?"Negative":"Positive";
        System.out.println("The Number is "+num);
    }
}