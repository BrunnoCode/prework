import java.util.*;

public class NumberToString{
 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   boolean validarRespuesta = false;
   String num;
   int number = 0;

   while (!validarRespuesta){
      System.out.println("Digite un Numero, y lo vamos a decir como es en ingles: ");
      if (scan.hasNextInt()){
        number = scan.nextInt();
        num = printNum(number);
        validarRespuesta = true;
        if (number > 10 || number < 1)
          System.out.println("Lo siento, todavia contamos de 1 a 10!");
        else
          System.out.println("El numero " + number + " en ingles es: " + num);
      }else
        System.out.println("Formato invalido, hay que ser un numero entre 1 y 10"); 
   }
   scan.close();
 }
 
 public static String printNum(int num){
   switch(num){
     case 1: return "ONE";
     case 2: return "TWO";
     case 3: return "THREE";
     case 4: return "FOUR";
     case 5: return "FIVE";
     case 6: return "SIX";
     case 7: return "SEVEN";
     case 8: return "EIGHT";
     case 9: return "NINE";
     case 10: return "TEN";
    default: return null;
   }
 }

}
