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
public class Calculadora {

    public static float promedio(int a, int b) {
        float resultado;

        resultado = a + b;
        resultado = resultado / 2; //se puede hacer esto de usar una variable en otra

        return resultado;
    }

    public static void main(String[] args) {//para que este metodo llame a otro ambos deben ser static
                                            //ovbio dentro de la  misma clase(calculadora en este caso)
        int num1;
        int num2;
        float resultado;

        Scanner escaner = new Scanner(System.in);
        System.out.println("Favor digite un numero:");
        num1 = escaner.nextInt();
        System.out.println("Favor digite otro numero");
        num2 = escaner.nextInt();

        resultado = promedio(num1, num2);
        System.out.println("El resultado es: " + resultado);
    }
}
