import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = n*n;
		int temp1 = n;
		int rev = 0;
		while(temp1!=0) {
			int a = temp1%10;
			rev = rev*10+a;
			temp1 = temp1/10;
			int c = rev;
		}
		int re = 0;
		int d = rev*rev;
		int temp2 = d;
		while(temp2!=0) {
			int a = temp2%10;
			re = re*10+a;
			temp2 = temp2/10;
		}
		int e = re;
        if(b == e){
            System.out.println("Adam num");
        }
        else 
        System.out.println("Not Adam num");
	}
}