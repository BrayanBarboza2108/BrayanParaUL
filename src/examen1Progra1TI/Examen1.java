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
        examen1Progra();
    }
    
    public static void examen1Progra(){
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Digite el nombre de la empresa: ");
        String nombreEmpresa = escaner.next();
        
        System.out.println("Digite la provincia de la empresa: ");
        System.out.println("1-San Jose 2-Alajuela 3-Cartago 4-Heredia 5-Guanacaste 6-Puntarenas 7-Limon");
        int numProvincia = escaner.nextInt();
        
        System.out.println("Digite el numero total de trabajadores: ");
        int numTotalTrabajadores = escaner.nextInt();
        
        System.out.println("Digite el numero de trabajadores que han tenido COVID-19: ");
        int numTrabajadoresCovid = escaner.nextInt();
        
        System.out.println("Digite el monto de ingreso por mes: ");
        int montoDeIngresoMes = escaner.nextInt();
        
        System.out.println(" La empresa cuenta con creditos?");
        System.out.println("1-Si o 2-No");
        
        int tieneCreditos = escaner.nextInt();
        int credito;
        int nuevoCredito;
        
        while(tieneCreditos == 1){
            System.out.println("Digite el valor del credito");
            credito = escaner.nextInt();
            
            System.out.println("Tiene mas creditos?");
            System.out.println("1-Si o 2-No");
            
            int masCreditos = escaner.nextInt();
            if(masCreditos > 1){
                tieneCreditos = 2;
            }
            while(masCreditos == 1){
                System.out.println("Digite su credito2: ");
                nuevoCredito = escaner.nextInt();
                break;
            }
            
        }
        
        int creditoTotal = credito + nuevoCredito;
        
        System.out.println("Credito total:" + creditoTotal);
        
        
        
        
        
        
    }
}