import java.util.Scanner;

class loop{
 public static void main(String[] args){
   int i,j,k;
   for(i=1;i<=7;i++){
     for(j=1;j<=i;j++){
       System.out.print(j);
      }
     for(k=1;k+i<=7;k++)
       System.out.print("*");
       System.out.print("\n");
    }
  }
}
