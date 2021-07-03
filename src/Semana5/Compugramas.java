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
public class Compugramas {
    public static void main(String[] args){
        compugrama2();
    }

    public static void compugrama1() {

        int n = 20;

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();//esto es solo para que haga el cambio de linea

        for (int i = 0; i < (n - 1); i++) {
            if (i < (n - 2)) {
                System.out.println("*");
            }//todo esto es para que en el ultimo * no haga cambio de linea sino que el cursos se detenga en el ultimo
            else {
                System.out.print("*");
            }
        }
        for (int i = 0; i < (n - 1); i++) {
            System.out.print("*");
        }
    }

    public static void compugrama2() {
        int n = 5;

        for (int i = 0; i < n; i++){//esto lo que hace es repetir "n" veces lo que esta dentro
            
            for(int j = 0; j < n; j++){     // || significa "o"
                if(i == 0 || i == (n-1) || j == 0 || j == (n-1)){//imprime si se cumple estas coniciones
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