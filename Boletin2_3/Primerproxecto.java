package Boletin2_3;

import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Primerproxecto {

    public static void main(String[] args) {
        float cambio;
        float euros;
        Scanner sc = new Scanner(System.in);       
        System.out.println("Introduce la conversión actual de euros a dolares");
        cambio = sc.nextFloat();
        sc.nextLine();
        System.out.println("Cuantos euros quieres cambiar?");
        euros = sc.nextFloat();
        float total = euros+(euros*cambio);
        System.out.println("Tus euros en dolares serán: " + total + "$");
        
    }
    
}
