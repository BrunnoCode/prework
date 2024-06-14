import java.util.*;

public class MaxNumInArray{
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     boolean valid = false;
     int arraySize = 0;

     while (!valid){
       System.out.println("Introduzca el tamaño del array:");
       try{
          arraySize = scan.nextInt();
          valid = true;

       }catch (InputMismatchException e){
          System.out.println("Por favor, introduzca un numero valido!");
          scan.next();
          valid = false;
       }  
     }

     int maxNum = max(scan, arraySize);
    
     System.out.printf("El numero mas alto del array es: %d\n", maxNum);
     scan.close();
  }
  
  public static int max(Scanner scan, int size){

    int arrayNum[] = new int[size];
    for (int i = 0; i < size; i++){
      System.out.print("Introduzca un numero a la posición "+(i+1)+" del array: ");
     while (true){
       try{
          arrayNum[i] = scan.nextInt();
          break;
       }catch (InputMismatchException e){
           System.out.println("No introduzir un valor que no sea numeros decimales!!!");
           scan.next();
       }
     }
   }
    int maxNum = arrayNum[0]; 
    for (int i = 0; i < size; i++){
      if (maxNum < arrayNum[i]){
        maxNum = arrayNum[i];
      }
    }
    System.out.println("El array esta compuesto por: ");
    for (int i = 0; i < size; i++){
      System.out.print("["+arrayNum[i]+"] ");
    }
    System.out.println();

    return maxNum;  
  } 	

}
