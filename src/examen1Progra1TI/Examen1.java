/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1Progra1TI;

import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class Examen1 {
    public static void main(String[] args){
        examen1();
        
    }
    
    public static void examen1(){
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Digite el nombre de la empresa: ");
        String nombreEmpresa = escaner.next();
        
        System.out.println("Digite la provincia de la empresa: ");
        System.out.println("1-San Jose 2-Alajuela 3-Cartago 4-Heredia 5-Guanacaste 6-Puntarenas 7-Limon");
        int numProvincia = escaner.nextInt();
        String nombreProvincia;
        int poblacion;
            if(numProvincia == 1){
                nombreProvincia = "San Jose";
                poblacion = 1404242;
            }
            else if(numProvincia == 2){
                nombreProvincia = "Alajuela";
            }
            else if(numProvincia == 3){
                nombreProvincia = "Cartago";
            }
            else if(numProvincia == 4){
                nombreProvincia = "Heredia";
            }
            else if(numProvincia == 5){
                nombreProvincia = "Guanacaste";
            }
            else if(numProvincia == 6){
                nombreProvincia = "Puntarenas";
            }
            else{
                nombreProvincia = "Limon";
            }
            
        
        System.out.println("Digite el numero total de trabajadores: ");
        int numTotalTrabajadores = escaner.nextInt();
        
        System.out.println("Digite el numero de trabajadores que han tenido COVID-19: ");
        int numTrabajadoresCovid = escaner.nextInt();
        
        System.out.println("Digite el monto de ingreso por mes: ");
        int montoDeIngresoMes = escaner.nextInt();
        
        System.out.println("La empresa cuenta con creditos?");
        System.out.println("1-Si o 2-No");
        
        int tieneCreditos = escaner.nextInt();
        int credito = 0;
        int nuevoCredito = 0;
        
        while(tieneCreditos == 1){
            System.out.println("Digite el valor del credito");
            credito = escaner.nextInt();
            tieneCreditos++;
        }
        System.out.println("Tiene mas creditos?");
        System.out.println("1-Si o 2-No");
        int masCreditos = escaner.nextInt();
        while(masCreditos == 1){
            System.out.println("Digite su credito:");
            nuevoCredito = escaner.nextInt()+ nuevoCredito;
            System.out.println("Tiene mas creditos?");
            System.out.println("1-Si o 2-No");
            masCreditos = escaner.nextInt();
        }
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Nombre de la empresa: " + nombreEmpresa);
        System.out.println("Provincia: " + nombreProvincia);
        System.out.println("Total de Trabajadores: " + numTotalTrabajadores);
        if(numTrabajadoresCovid >= 20){
            System.out.println("20 o mas trabajadores contagiados de COVID-19");
        }
        else{
            System.out.println("Numero de contagiados Covid-19" + numTrabajadoresCovid);
        }
        System.out.println("Monto de ingreso al mes" + montoDeIngresoMes);
        
        System.out.print("Credito total:");
        System.out.println(credito + nuevoCredito);
        //todo perfecto hasta aqui
        
        
    }
}