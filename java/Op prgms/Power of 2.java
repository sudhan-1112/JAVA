import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean pow=(n>0)&&(n&(n-1))==0?true:false;
        System.out.println("Power of 2: "+pow);
    }
}