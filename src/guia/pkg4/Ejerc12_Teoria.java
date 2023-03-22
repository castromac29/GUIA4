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
public class Ejerc12_Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer =new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra o frase");
        vocalPorCaracteres(leer.next());
        
    }
    public static void vocalPorCaracteres(String palabra){
        //a=@, e=#, i=$, o=%, u=*
        String caracter ="";
        for (int i=0; i < palabra.length(); i++){
            switch (palabra.substring(i, i+1)){
                case "a":
                case "A":
                    caracter += "@";
                    break;
                case "e":
                case "E":
                    caracter += "#";
                    break;
                case "i":
                case"I":
                    caracter += "$";
                     break;
                case "o":
                case "O":
                    caracter += "%";
                        break;
                case "u":
                case"U":
                    caracter += "*";
                        break;
                default:
                    caracter += palabra.substring(i, i+1);
                                 
                 
                
            }
        }
        System.out.println("Al cambiar las vocales por los caracteres, la frase "
                + "ingresada queda " + caracter);
    }

}
