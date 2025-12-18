import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.printf(a+" "+b+" "+c+" ");
		for(int i=1; i<=n; i++) {
			int d = a+b+c;
			System.out.printf(d+" ");
			a=b;
			b=c;
			c=d;
		}
		System.out.println();
	}
}