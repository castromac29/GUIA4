/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4;

/**
 *
 * @author castr
 */
import java.util.Scanner;

public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;

        System.out.println("Seleccione que desea hacer");
        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(suma(num1, num2));
                break;
            case 2:
                System.out.println(resta(num1, num2));
                break;
            case 3:
                System.out.println(mult(num1, num2));
                break;
            case 4:
                System.out.println(div(num1, num2));
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta");
        }
    }
public static int suma(int num1,int num2){
    return num1 + num2;
}
public static int resta(int num1,int num2){
    return num1 - num2;
}
public static int mult(int num1,int num2){
    return num1 * num2;
}
public static double div(int num1,int num2){
    return num1 / num2;
}
}
