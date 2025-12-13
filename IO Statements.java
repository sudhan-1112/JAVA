//To print the Given words//
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String w=sc.next();
        System.out.println("Entered: " + w);
    }
}

//To print the Given Message//
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        System.out.println("Entered: " + w);
    }
}

//To print the Integer from the User//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Entered: "+n);
    }
}


//To print the fractional from the User//
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        System.out.println("Entered: "+ n);
    }
}

//To Convert integer to hexadecimal//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("Hexadecimal: %x",n);
    }
}

//To Convert Integer to Octal//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();
        System.out.printf("Octal: %o\n",n);
    }
}

//To convert Hexadecimal to Integer//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String hex=sc.nextLine();
        int n=Integer.parseInt(hex,16);
        System.out.println("Integer->"+n);
    }
}

//To convert Octal to Integer//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String oct=sc.nextLine();
        int n=Integer.parseInt(oct,8);
        System.out.println("Integer->"+n);
    }
}

//To Print ASCII Values//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        System.out.println("ASCII: " + (int)c);
    }
}

//To print space btw two Integers//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(n1+" "+n2);
    }
}

//To print Tab space btw two Integer//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(n1+"\t"+n2);
    }
}

//To print output seperae lines//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.printf("%d\n%d\n",n1,n2);
    }
}

//To print char with single quotes//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        System.out.printf("'%c'",c);
    }
}

//To print char with double quotes//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        System.out.printf("\"%c\"",c);
    }
}

//To find the character size of int chr float double//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        System.out.println("Integer: " + Integer.BYTES);
        System.out.println("Character: "+ Character.BYTES);
        System.out.println("Float: "+ Float.BYTES);
        System.out.println("Double: "+Double.BYTES);
    }
}

//To print the Roll no & Name//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Scanner sc=new Scanner (System.in);
       int rn=sc.nextInt();
       String ne=sc.nextLine();
       System.out.println("Roll No: "+rn);
       System.out.println("Name: "+ne);
    }
}

//To print marks in 5 subjects//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Scanner sc=new Scanner (System.in);
       int s1=sc.nextInt();
       int s2=sc.nextInt();
       int s3=sc.nextInt();
       int s4=sc.nextInt();
       int s5=sc.nextInt();
       System.out.println("Mark 1: "+s1);
       System.out.println("Mark 2: "+s2);
       System.out.println("Mark 3: "+s3);
       System.out.println("Mark 4: "+s4);
       System.out.println("Mark 5: "+s5);
       
    }
}

//To print your BloodGroup type//
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter your Blood group: ");
       String b=sc.nextLine();
       System.out.println("Your Blood Group: "+b);
       
    }
}

//To print current time//
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Main{
public static void main(String[]args){
    LocalTime time=LocalTime.now();
    DateTimeFormatter format=DateTimeFormatter.ofPattern("HH:mm:ss");
    System.out.println("Current Time: "+time.format(format));
}
}

//To print address in seperate lines//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your street: ");
        String street = sc.nextLine();
        System.out.print("Enter your city: ");
        String city = sc.nextLine();
        System.out.print("Enter your country: ");
        String country = sc.nextLine();
        System.out.println("\nYour Address:");
        System.out.println(name + "\n" + street + "\n" + city + "\n" + country);
    }
}

//To print DOB//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day (DD): ");
        int day = sc.nextInt();
        System.out.print("Enter month (MM): ");
        int month = sc.nextInt();
        System.out.print("Enter year (YYYY): ");
        int year = sc.nextInt();
        System.out.printf("Date of Birth: %02d/%02d/%d\n", day, month, year);
    }
}

//To add + before int//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.printf("+%d\n", num);
    }
}
