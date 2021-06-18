/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author Brayan
 */
public class MetodoEjecucionDos {
    public static void main(String[] args){
        MetodoEjecucionDos variable = new MetodoEjecucionDos();
        variable.unMetodo();
        variable.otroMetodo();
    }
    
    public void unMetodo(){//notese que no esta estatico(static)
        System.out.println("bye");
    }
    
     public void otroMetodo(){//notese que no esta estatico(static)
        System.out.println("bye");
    }
}
