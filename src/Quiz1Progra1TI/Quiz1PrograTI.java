/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1Progra1TI;

import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class Quiz1PrograTI {

    public static void main(String[] args) {
        public int pedirOrden(int peperoni, int jamon, int queso, int tamaño) {

            Scanner escaner = new Scanner(System.in);

            int elegirPeperoni;

            System.out.println("Desea pepperoni?");
            System.out.println("1=si  0=no");

            elegirPeperoni = escaner.nextInt();

            int elegirJamon;

            System.out.println("Desea jamon?");
            System.out.println("1=si  0=no");
            elegirJamon = escaner.nextInt();

            int elegirQueso;
            System.out.println("Desea queso?");
            System.out.println("1=si  0=no");
            elegirQueso = escaner.nextInt();
            
            int tamaño;
            System.out.println("Tamaño de Pizza");
            System.out.println("1=Grande 0=Pequeña");
            tamaño = escaner.nextInt();

            if (elegirPeperoni == 1) {
                elegirPeperoni = 100;
            }
            if (elegirJamon == 1) {
                elegirJamon = 100;
            }
            if (elegirQueso == 1) {
                elegirQueso = 100;
            }
            if (tamaño == 1) {
                tamaño = 200;
            }

            System.out.println("Monto a Pagar: ");
            System.out.println(elegirPeperoni + elegirJamon + elegirQueso + tamaño);
        return 0;
        }
    }
}
