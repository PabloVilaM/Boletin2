package Boletin2_4;

import java.util.Scanner;

public class Primerproxecto {

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);       
        System.out.println("Introduce un numero para sumar restar dividir y multiplicar");
        num1 = sc.nextInt();
        System.out.println("Introduce un segundo numero");
        num2 = sc.nextInt();
        int suma = num1+num2;
        int resta = num1-num2;
        int resta2 = num2-num1;
        int multiplicacion = num1*num2;
        float division = (float)num1/num2;
        float division2 = (float)num2/num1;
        //System.out.println("Con tus numeros tienes de suma: " + suma + " de resta: " + resta + " tu segunda resta: " + resta2 + " tu multiplicacion: " + multiplicacion + " tu primera division: " + division + " tu segunda division: " + division2);
        System.out.println("La suma es: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("La resta es: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("La resta2 es: " + num2 + " - " + num1 + " = " + resta2);
        System.out.println("La multiplicacion es: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("La división es: " + num1 + " / " + num2 + " = " + division);
        System.out.println("La división2 es: " + num2 + " / " + num1 + " = " + division2);
        
        
    }
    
}
