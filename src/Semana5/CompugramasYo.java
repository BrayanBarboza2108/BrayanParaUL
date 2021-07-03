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
public class CompugramasYo {
    public static void main(String[] args){
        int n = 5;

        for (int i = 0; i < n; i++){//esto lo que hace es repetir "n" veces lo que esta dentro
            
            for(int j = 0; j < n; j++){
                if(i == 0 || i == (n-1) || j== 0 || j == (n-1)){
                        //esto significa "o"
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}