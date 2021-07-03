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
public class EjemploSwitchTexto {
    public static void main(String[] args){
        String ingrediente = "peperoni";
        //asi se declara un swicth
        switch(ingrediente){//se le asigna la variable con la que trabajara
            case "piña":{//va entrando en todos los case apartir de que se cumple al menos uno
                System.out.println( "piña");
                break;//esto es un freno para que no siga
            }
            case "peperoni":{
                System.out.println( "peperoni");
                break;//con esto hago que solo entre a esta region y no continue entrando a las que siguen
            }       //una vez se ejecuta un break; el programa se sale del switch
            case "jamon":{
                System.out.println( "jamon");
                break;
            }
            default:{//si no se cumple ninguna de todas las anteriores entonces siempre se ejecuta esta
                System.out.println("este ingrediente no esta contemplado");
            }
        }
        
        System.out.println("aqui sigue leyendo despues del break;");
        
    }
}