//Write a program to print the Fibonacci series up to a given number.
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number of terms:");
        int n=sc.nextInt();

        int a=0;//First term
        int b=1;//second term

        System.out.println("Fibonacci series up to " +  n  + ":");

        for (; a <= n; ) {
            System.out.print(a + " "); //"" defines space
            int next = a + b;
            a = b;
            b = next;
        }
    }
    
}
