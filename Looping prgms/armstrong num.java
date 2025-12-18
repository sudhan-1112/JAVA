import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int temp = a;
		while(temp!=0) {
			int b = temp%10;//153%10 = 3 , 15%10 = 5, 1%10 = 1
			sum = sum+(b*b*b);// 0+(3*3*3) = 27, //27+(5*5*5) == 27+125 = 152 , 152+(1*1*1) = 153
			temp=temp/10;//15, // 1
		}
		if(sum == a) {
			System.out.println("Armstrong num");
		}
		else {
			System.out.println("Not an armstrong num");
		}
	}
}