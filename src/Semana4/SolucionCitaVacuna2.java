/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class SolucionCitaVacuna2 {
    /**esto es dando doble clic a "obtenerCitaVacuna" y luego al bombillito en la ultima opcion-
     *Este metodo devuelve el calendario de cita para vacunacion
     * @return un mensaje con las fechas
     */
    public String obtenerCitaVacuna(){
        Scanner escaner = new Scanner(System.in);
        String resultado;
        short numFactores;
        
        System.out.println( "Favor digitar el numero de Factores de Riesgo: ");
        numFactores = escaner.nextShort();//asi se guarda el valor que el usuario digite

        if (numFactores == 1) {
            resultado = "Una semana";
        } else if (numFactores == 2) {
            resultado = "3 dias";
        } else {
            resultado = "Dia siguiente";
        }
        return resultado;
    }
}
