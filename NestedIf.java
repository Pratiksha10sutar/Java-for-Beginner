//Write a program to find the largest of three numbers using nested if-else.
class NestedIf{
    public static void main(String[] args) {
      int a=10;
      int b=14;
      int c=6;

    if(a>b){
            if(a>c){
            System.out.println("a is greater");
            }
            else{
            System.out.println("c is greater"); 
            }
           }
    else {
          if(b>c){
            System.out.println("b is greater");
             }
             else{  
           System.out.println(" c is greater"); 
             }
        }
    
    }
}