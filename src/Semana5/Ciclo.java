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
public class Ciclo {
    public static void main(String[] args){

        int hh = 0;//aqui se va guardando cuantas veces se a ejecutado la linea del while

        while (hh <= 1000) { //el while se ejecuta todas las veces que se cumpla su condicion
            //cuando la condicion deje de cumplirse entonces se sale del ciclo
            System.out.println(hh);

            //hh = hh + 1;
            hh++;//esto es para que aumente el valor de la variable
        }
        //todo el int y while de arriba hace exactamente lo mismo que el for de aqui abajo
        //solo que el for es mas compacto

        for(int i = 0 ;i < 1000;i = i + 1){
            System.out.println(i);
        }

        //i = i + 1 es equivalente a i++
    }
}