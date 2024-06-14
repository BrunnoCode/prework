import java.util.*;

public class OddEven{
 public static void main(String[] args){
   System.out.print("Introduzca un numero: ");
   Scanner scan = new Scanner(System.in);
   int num = Integer.parseInt(scan.nextLine());
   isOddEven(num);
   scan.close();
  } 

 public static void isOddEven(int num){
   if (num % 2 == 0)
      System.out.println("El numero "+num+" es par!");
   else
      System.out.println("El numero "+num+" es impar!");
 }
}
