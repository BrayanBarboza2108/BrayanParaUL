/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5;

/**
 *
 * @author Brayan
 */
public class EjemploSwitchMarcaAuto {

    public static void main(String[] args) {
        String marcaAuto = "chevrolet";
        //asi es como se declara un switch
        switch (marcaAuto) {
            case "toyota": {
                System.out.println("su auto es toyota");
                break;
            }
            case "chevrolet": {
                System.out.println("su auto es chevrolet");
                break;
            }//si no se pone el break; el default si se ejecuta como si fuera un case
            default: {
                System.out.println("marca no encontrada :/ ");
            }
        }
    }
}