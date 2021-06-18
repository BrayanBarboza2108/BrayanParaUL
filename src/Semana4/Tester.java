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
public class Tester {//con el metodo main se inician las clases
    public static void main(String[] args){
        SolucionIR4 s = new SolucionIR4();//aqui estoy llamando un metodo que esta en otro archivo
        double r = s.calcularImpuesto(4, 1000000);
        System.out.println(r);

    }
}