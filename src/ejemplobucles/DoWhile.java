package ejemplobucles;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class DoWhile {
    int i=0,acuSuma=0,acuProducto=1,num;
    Scanner teclado=new Scanner(System.in);
    public void calcularDoWhile(){
        do{
            System.out.println("Introduce número");
            num=teclado.nextInt();
            acuSuma=acuSuma+num;
            acuProducto=acuProducto*num;
            i++;
        }while(i<7);
        System.out.println("Suma = "+acuSuma+"\nProducto = "+acuProducto);
    }

}
