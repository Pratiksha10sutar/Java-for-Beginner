//Write a program to calculate the factorial of a number using a while loop
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial=1;
        int i=1;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();

        while(i<=n){
            factorial=factorial*i;
            i++;
        }
      System.out.println("Factorial of number "+n+" is:" +factorial);
}
        
    }
    
