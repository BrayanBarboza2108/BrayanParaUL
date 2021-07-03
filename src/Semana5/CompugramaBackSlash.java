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
public class CompugramaBackSlash {
    public static void main(String[] args){
        int n = 10;

        for (int i = 0; i < n; i++){//esto lo que hace es repetir "n" veces lo que esta dentro
            
            for(int j = 0; j < n; j++){     // || significa "o"  //con esto se hace el back slash
                if(i == 0 || i == (n-1) || j == 0 || j == (n-1) || i == j){//imprime si se cumple estas coniciones
                    System.out.print("*");//las i son para las filas, las columnas son la j
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
