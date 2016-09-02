import java.util.Scanner;

class switch{
 public static void main(String [] args){
  int a;
  Scanner sc = new Scanner(System.in);
  System.out.print("What is 1+1\n");
  a=sc.nextInt();
  switch(a){
    case 1:
       System.out.print("Wrong\n");
       break;
    case 2:
       System.out.print("Correct\n");
       break;
    default:
      System.out.println("Wrong");
     }
   }
 }
