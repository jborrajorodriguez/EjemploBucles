package ejemplobucles;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 * Realiza un programa que calcule e visualice a suma e producto de 7 numeros que pedimos por teclado.
 */
public class EjemploBucles {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Elegir opcion=new Elegir();
        System.out.println("Escoge:\n 1-While\n2-Do While\n3-For");
        int opc=teclado.nextInt();
        opcion.escoger(opc);
      
        //While ejemplo1=new While();
        //ejemplo1.calularWhile();
        //DoWhile ejemplo2=new DoWhile();
        //ejemplo2.calcularDoWhile();
        //For ejemplo3=new For();
       // ejemplo3.contarFor();
    }

}
