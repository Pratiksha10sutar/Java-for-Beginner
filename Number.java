
//Write a program to check if a number is positive, negative, or zero.
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        Double a= sc.nextDouble();
        
        if(a>0){
            System.out.println("positive number:"+a);
        }
        else if(a<0){
            System.out.println("negative number:"+a);
        }
        else{
            System.out.println("number is zero:"+a);
        }
        sc.close();
    }

    
}
