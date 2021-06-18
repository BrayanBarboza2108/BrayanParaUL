/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class EstructurasDeControl {
    public static void main(String[] args){

        System.out.println("Por favor, digite su edad");
        Scanner pedirEdad = new Scanner(System.in);
            //este lo pueden usar todo pues esta fuera de todos pero dentro del main
        int edad = pedirEdad.nextInt();
                        //java siempre solo ejecutara uno, nunca dos o mas
        if(edad >= 60){//esto tambien son regiones, osea se puede tener variables locales igual que en los metodos
            int factorRiesgo = 5;
            if(edad >= 50){
                System.out.println("Es urgente la inyeccion, edad: "+edad+ " riesgo: " +factorRiesgo);
            }
            else{
                System.out.println("Es urgente la inyeccion, edad: "+edad+ " riesgo: " +factorRiesgo);
            }

        }
        else if(edad >= 40){
            System.out.println("Es relativamente urgente la inyeccion, edad: " +edad);
        }
        else{
        System.out.println("No es tan urgente la inyeccion, edad: " +edad);

        }

    }
}
