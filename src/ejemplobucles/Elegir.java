package ejemplobucles;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Elegir {
   Scanner teclado=new Scanner(System.in);
   While ejemplo1=new While();
   DoWhile ejemplo2=new DoWhile();
   For ejemplo3=new For();
   //int num=teclado.nextInt();
   public void escoger(int num){
       switch(num){
           case 1:System.out.println("While");
           ejemplo1.calularWhile();
           break;
           case 2:System.out.println("DoWhile");
           ejemplo2.calcularDoWhile();
           break;
           case 3:System.out.println("For");
           ejemplo3.contarFor();
           break;
           default:System.out.println("Error");
       }
       
   }
   

}
