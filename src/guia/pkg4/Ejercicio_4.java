/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        NumPrimo(num);

        System.out.println(num + " " + NumPrimo(num));
    }

    public static boolean NumPrimo(int num) {
        boolean resultado;
        int k = 0;
        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                k = k + 1;
            }
        }
        if (k == 2) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;

    }
}
