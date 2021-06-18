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
public class SolucionIR2 {

    public double calcularImpuesto(int numDependientes, double salario) {
        double resultado = 0;
        double montoPorDependientes;//esta debe ir al inicio por que la compu va de arriba hacia abajo

        if (numDependientes == 1){
            montoPorDependientes = salario * 1;

        } else if (numDependientes == 2){
            montoPorDependientes = salario * 0.9;

        } else if (numDependientes == 3){
            montoPorDependientes = salario * 0.7;

        } else if (numDependientes == 4){
            montoPorDependientes = salario * 0.6;

        } else {//ya no se cumplio ninguna de las anteriores asi que no hay que decirle que 4 o mas, basta con el else
            montoPorDependientes = salario * 0.4;
        }

        if (salario < 200000){
            resultado = 0;
        } 
        else if (salario < 400000){
            resultado = montoPorDependientes * 0.1;
        } 
        else if (salario < 600000){
            resultado = montoPorDependientes * 0.15;
        } 
        else if (salario < 800000){
            resultado = montoPorDependientes * 0.2;
        } 
        else {
            resultado = montoPorDependientes * 0.3;
        }

        return resultado;
    }
}