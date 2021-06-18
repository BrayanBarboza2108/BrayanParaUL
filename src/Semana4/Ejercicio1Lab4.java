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
public class Ejercicio1Lab4 {
    public String covid(int numFactores){//el int numFactores son los materiales que ocupa pedro
        String cita;//primero se abre el espacio y despues se le returna el texto del ciclo de if's

        if (numFactores == 1){
            cita = "Su cita sera dentro de una semana";
        } else if (numFactores == 2){
            cita = "Su cita sera dentro de 3 dias";
        } else if (numFactores == 3){
            cita = "Su cita sera mañana";
        } else {
            cita = "Su cita sera mañana";
        }
        return cita;//este returna el texto
    }
}