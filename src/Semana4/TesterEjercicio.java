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
public class TesterEjercicio {
    public static void main(String[] args){//se llama a la clase, no al metodo
        Ejercicio1Lab4 s = new Ejercicio1Lab4();//aqui estoy llamando un metodo que esta en otro archivo
        String r = s.covid(2);//esto es para fijar el parametro, son los materiales que le damos a pedro
        System.out.println(r);//esta imprimiendo una variable, a esta se le asigna texto en la otra clase

    }
}