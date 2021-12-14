package Boletin2_5;

import java.util.Scanner;

public class Primerproxecto {

    public static void main(String[] args) {
        final int metros = 1852;
        float millas;       
        System.out.println("Dime un numero de millas para pasar a metros");
        Scanner sc = new Scanner(System.in);
        millas = sc.nextFloat();
        
        System.out.println("Tus millas en metros son: " + millas*metros + "m");
    }
    
}
