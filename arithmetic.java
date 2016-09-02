import java.util.Scanner;

class arithmetic{
 public static void main(String [] args){
   int a1,a2;
   Scanner sc = new Scanner(System.in); 
   a1=sc.nextInt();
   a2=sc.nextInt();
   System.out.println("The result of addition is "+(a1+a2));
   System.out.println("The result of substraction is "+(a1-a2));
   System.out.println("The result of multiplication is "+(a1*a2));
   System.out.println("The result of division is "+(a1/a2)); 
  }
 }
