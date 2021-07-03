/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;

/**
 *
 * @author Brayan
 */
public class Compugramas {
    public static void main(String[] args){
        int n = 5;
        
        int i = 0;
        while(i < n){
            if(i==(n-1)){
                System.out.print(">");
            }
            else{
                System.out.print("- ");
            }
            i++;
        }
        
    }
    
}