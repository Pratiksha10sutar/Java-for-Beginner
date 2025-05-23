//Write a program to determine the grade of a student based on their marks (A, B, C, D, F).
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks:");
        int Marks=sc.nextInt();

        if(Marks>100 || Marks<0){
            System.out.println("Invalid Marks");
        }
        else if(Marks>=91 && Marks<=100){
            System.out.println("A+");
        }
       else if(Marks>=81 && Marks<=90){
            System.out.println("A");
        }
        else if(Marks>=71 && Marks<=80 ){
            System.out.println("B+");
        }
        else if(Marks>=61 && Marks<=70 ){
            System.out.println("B");
        }
        else if(Marks>=51 && Marks<=60 ){
            System.out.println("C+");
        }
        else if(Marks>=35){
            System.out.println("C");
        }
        else{
            System.out.println("Failed");
        }

      sc.close();

    }   
    }
