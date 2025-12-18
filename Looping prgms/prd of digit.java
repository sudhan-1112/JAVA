import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prd = 1;
        while(n!=0){
            int a=n%10;
            prd*=a;
            n=n/10;
        }
        System.out.println(prd);
    }
}