/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

/**
 *
 * @author Brayan
 */
public class SolucionRiesgo1 {

    /**esto es dando doble clic a "obtenerCitaVacuna" y luego al bombillito en la ultima opcion-
     *Este metodo devuelve el calendario de cita para vacunacion
     * @param numRiesgos es la cantidad de factores de riesgos de la persona a sacar cita
     * @return un mensaje con las fechas
     */
    public String obtenerCitaVacuna(short numRiesgos) {
        String resultado;

        if (numRiesgos == 1) {
            resultado = "Una semana";
        } else if (numRiesgos == 2) {
            resultado = "3 dias";
        } else {
            resultado = "Dia siguiente";
        }
        return resultado;
    }
}
