import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev= 0;
		int temp = n;
		while(temp!=0) {
			int a=temp%10;
			rev = rev*10+a;
			temp=temp/10;
		}
		if(n == rev) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
	}
}