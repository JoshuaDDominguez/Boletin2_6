
package boletin2_6;

import java.util.Scanner;
public class Boletin2_6 {

    
    public static void main(String[] args) {
        
        float desc,tarifa,pago;
        Scanner sc= new Scanner (System.in);
        System.out.println("Precio de la tarifa");
        tarifa=sc.nextFloat();
        System.out.println("Precio que se pago");
        pago= sc.nextFloat();
        System.out.println("El descuento realizado fue del "+(tarifa-pago)/tarifa*100+"%");
        
    }
    
}
