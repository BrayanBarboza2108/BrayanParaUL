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
public class EjemploSwitch {
    public static void main(String[] args){
        int edad = 20;
        //asi se declara un swicth
        switch(edad){//se le asigna la variable con la que trabajara
            case 10:{//va entrando en todos los case apartir de que se cumple al menos uno
                System.out.println( "Usted tiene 10 años");
                break;//esto es un freno para que no siga
            }
            case 20:{
                System.out.println( "Usted tiene 20 años");
                break;//con esto hago que solo entre a esta region y no continue entrando a las que siguen
            }       //una vez se ejecuta un break; el programa se sale del switch
            case 50:{
                System.out.println( "Usted tiene 50 años");
                break;
            }           //y si no se usa un break; entondes el default tambien se ejecuta
            default:{//si no se cumple ninguna de todas las anteriores entonces siempre se ejecuta esta
                System.out.println("esta edad no esta contemplada");
            }
        }

        System.out.println("aqui sigue leyendo despues del break;");

        if (edad < 15){

        }                 //&& significa pero
        else if (edad >= 15 && edad <40){

        }
        else if (edad >= 40 && edad <80){

        }
        else{//si no se cumple ninguna de las anteriores entonces siempre se cumple esta

        }
    }
}