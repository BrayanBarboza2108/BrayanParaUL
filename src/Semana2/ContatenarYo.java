/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class ContatenarYo {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);//el Scanner es para pedir datos al usuario
        
        System.out.println("Universidad Latina de Costa Rica");
        System.out.println("Facultad TICs");
        System.out.println("Programacion para TI");
        System.out.println();
        System.out.println("Por favor, digite un numero: ");
        
        int box1 = escaner.nextInt();//Declarar y asignar en la misma linea, siguen siendo procesos independientes
        System.out.println("Por favor, digite otro numero: ");

        int num2 = escaner.nextInt();

        System.out.println("Resultado: ");
        String nombre = "Brayan B.Barboza";
        //String resultado = nombre + " " + num2 + " " + box1;

        System.out.println(nombre + " " + num2 + " " + box1);//para que ponga un espacio en el resultado
        //el ln es para hacer cambios de linea
    }
}
