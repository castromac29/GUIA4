/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("---------------------------");
            System.out.println("1 - Convertir a DOLAR");
            System.out.println("2 - Convertir a YEN");
            System.out.println("3 - Convertir a LIBRA");
            System.out.println("4 - SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    convertdolar();
                    continue;
                case 2:
                    convertyen();
                    continue;
                case 3:
                    convertlibra();
                    continue;
                case 4:
                    System.out.println("HASTA LUEGO");
                    continue;
                default:
                    System.out.println("EL VALOR INGRESADO ES INCORRECTO");
                    continue;
            }
        } while (!(opcion == 4));

    }

    public static void convertdolar() {
        Scanner leer = new Scanner(System.in);
        String resp;
        do {
            System.out.println("INGRESE EL MONTO PARA CONVERTIR A DOLAR");
            double euro = leer.nextInt();
            System.out.println("-----------------");
            System.out.println("DOLAR=" + euro * 1.28611);
            System.out.println("-------------------");
            do {
                System.out.println("¿Desea volver a intentar s/n?");
                resp = leer.next();
                if (resp.equalsIgnoreCase("N")) {
                    break;
                }
            } while (!(resp.equalsIgnoreCase("s")));
        } while (!(resp.equalsIgnoreCase("N")));
    }

    public static void convertyen() {
        Scanner leer = new Scanner(System.in);
        String resp;
        do {
            System.out.println("INGRESE EL MONTO PARA CONVERTIR A YENES");
            double euro = leer.nextInt();
            System.out.println("-----------------");
            System.out.println("YEN=" + euro * 129.852);
            System.out.println("-------------------");
            do {
                System.out.println("¿Desea volver a intentar s/n?");
                resp = leer.next();
                if (resp.equalsIgnoreCase("N")) {
                    break;
                }
            } while (!(resp.equalsIgnoreCase("s")));

        } while (!(resp.equalsIgnoreCase("N")));
    }

    public static void convertlibra() {
        Scanner leer = new Scanner(System.in);
        String resp;
        do {
            System.out.println("INGRESE EL MONTO PARA CONVERTIR A LIBRA");
            double euro = leer.nextInt();
            System.out.println("-----------------");
            System.out.println("DOLAR=" + euro * 0.86);
            System.out.println("-------------------");
            do {
                System.out.println("¿Desea volver a intentar s/n?");
                resp = leer.next();
                if (resp.equalsIgnoreCase("N")) {
                    break;
                }
            } while (!(resp.equalsIgnoreCase("s")));
        } while (!(resp.equalsIgnoreCase("N")));
    }
}
