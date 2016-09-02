import java.util.Scanner;

public class logical{
 public static void main(String [] args){
  int MidSem,Quiz,EndSem;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter midsem marks\n");
  MidSem=sc.nextInt();
  System.out.print("Enter Quiz marks\n");
  Quiz=sc.nextInt();
  System.out.print("Enter final marks\n");
  EndSem=sc.nextInt();
  int avg =(EndSem + Quiz + MidSem)/3;
  if(avg>=90){System.out.println("A");
   }
  else if(avg>=70 && avg<90){
    System.out.println("B");
   }
  else if(avg>=50 && avg<70){
    System.out.println("C");
   }
  else {
      System.out.println("D");
   }
 }

}
