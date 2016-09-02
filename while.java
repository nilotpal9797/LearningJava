import java.util.Scanner;

class while{
 public static void main(String [] args){
     int a;
     Scanner sc = new Scanner(System.in);
     System.out.print("What is 2+3\n");
     while(1==1){
      a= sc.nextInt();
      if(a==5){
         System.out.print("Correct ans\n");
         break;
       }
     else{
          System.out.println("Wrong");
      }
    }
  }
}
