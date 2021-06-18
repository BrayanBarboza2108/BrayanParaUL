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
public class TesterCitaVacuna1 {
    public static void main(String[] args){
        SolucionRiesgo1 solucion = new SolucionRiesgo1();

        short nFactores = 2;//es lo mismo
        String mensaje;

        mensaje = solucion.obtenerCitaVacuna(nFactores);

        System.out.println(mensaje);
    }
}
