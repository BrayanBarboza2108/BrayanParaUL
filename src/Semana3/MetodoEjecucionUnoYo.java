/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author Brayan
 */
public class MetodoEjecucionUnoYo {
    public static void main(String[] args){
        unMetodo();//con esto se llama al otro metodo
        
    }
    
    public static void unMetodo(){
        System.out.println("bye");
    }
    
     public static void otroMetodo(){
        System.out.println("bye");
    }
}