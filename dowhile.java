import java.util.Scanner;

class dowhile{
 public static void main(String [] args){
   int a;
   Scanner sc = new Scanner(System.in);
   System.out.print("What is 2*2\n");
   do{
        System.out.print("Enter your ans\n");
        a=sc.nextInt();
        if(a!=4)
         System.out.print("Wrong\n");
     }
   while(a!=4);
   System.out.print("Correct\n");
  }
}
