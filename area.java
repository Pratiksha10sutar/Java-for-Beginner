//Write a program to calculate the area of a circle given the radius.
import java.util.Scanner;
public class area {
public static void main(String[] args) {
    double area;
    //double pi=3.14;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the radius:");
    double  r=sc.nextDouble();
    area=Math.PI*r*r;
    System.out.println("Area of the circle:"+area);
    sc.close();
}    
}
