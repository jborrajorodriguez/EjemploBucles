package ejemplobucles;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class For {
    int num,acuSuma=0,acuProducto=1,i;
    Scanner teclado=new Scanner(System.in);
    public void contarFor(){

        for(i=0;i<7;i++){
            System.out.println("Pedir número");
            num=teclado.nextInt();
            acuSuma=acuSuma+num;
            acuProducto=acuProducto*num;
        }
        System.out.println("Suma = "+acuSuma+"\nProducto = "+acuProducto);
    }
       
}
