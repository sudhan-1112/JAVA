import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        for(int i=100;i<=1000;i++){
            int temp = i;
            int sum = 0;
            int prd = 1;
             
            while(temp>0){
               
                int rem = temp%10;
                sum = sum+rem;
                prd = prd*rem;
                temp=temp/10;
            }
        
            if(sum == prd){
            System.out.println(i+"Spy num");
            }
        }
    }
}