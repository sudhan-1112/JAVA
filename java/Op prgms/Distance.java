import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextInt();
        double y1=sc.nextInt();
        double x2=sc.nextInt();
        double y2=sc.nextInt();
        double dx=(x2-x1);
        double dy=(y2-y1);
        double dsp=Math.sqrt(dx*dx+dy*dy);
        System.out.println("Distance between the Point: "+dsp);
    }
}