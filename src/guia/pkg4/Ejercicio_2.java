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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
//    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
//    ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, 
//    el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando 
//    el usuario ingrese la palabra “No”.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Desea ingresar una persona S/N");
        String resp = leer.nextLine();
        if (resp.equalsIgnoreCase("s")) {
            devol();
        }
        if (resp.equalsIgnoreCase("n"))  {
            System.out.println("ENTONCES NO JODA");
        }
        else {
            System.out.println("OPCION INCORRECTA");
    }

}

public static void devol() {
        Scanner leer = new Scanner(System.in);
        String resp;

        do {
            System.out.println("Ingrese su nombre");
            String nom = leer.next();
            System.out.println("Ingrese la edad de la persona");
            int edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println("Usuario ingresado " + nom + " Con " + edad + " Años de edad - MAYOR DE EDAD");
            } else {
                System.out.println("Usuario ingresado " + nom + " Con " + edad + " Años de edad - MENOR DE EDAD");
            }
            System.out.println("");
            System.out.println("----------------------------------------------");
            System.out.println("");
            System.out.println("Desea agregar otro usuario????");
            resp = leer.next();

            System.out.println("----------------------------------------------");
            if (resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("n")) {

            } else {
                System.out.println("La respuesta ingresada es incorrecta");
            }
        } while (!(resp.equalsIgnoreCase("N")));

        System.out.println("ADIOS");
    }
}
