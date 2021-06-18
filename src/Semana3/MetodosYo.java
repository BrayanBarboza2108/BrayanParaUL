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
public class MetodosYo {
    static int iva = 100;//esto es una variable global, esta fuera de los metodos pero dentro de la clase
    //debe ser static por que el metodo lo es
    
    
    public static long sumar(long numero1, long numero2){//metodo
        long resultado;//este resultado es totalmente distinto del otro
        resultado = numero1 + numero2 + iva;
        return resultado;//es para que retorne el valor de la variable
        //return debe ir al final sino no funciona
    }
    
    /**
     *para abrir esto se le da clic al bombillo
     * @param numero1
     * @param numero2
     * @return
     */
    public static float sumar(float numero1, float numero2){//notese que es con float
        float resultado;
        resultado = numero1 + numero2 + iva;
        return resultado;
    }
                  //se usa el long para numeros mas grandes, pero es lo mismo que int
     public static long multiplicar(long numero1, long numero2){//metodo
        long resultado;//ya que estan dentro de distintos metodos
        long mult = numero1 * numero2;
        resultado = sumar(mult, iva);//otra forma de hacerlo
        return resultado;
    }
     
    public static int multiplicar(int numero1, int numero2, int numero3){//metodo
        int resultado;//ya que estan dentro de distintos metodos
        resultado = (numero1 * numero2 * numero3) + iva;
        return resultado;
    }
    
    public static void main(String[] args){//esta linea es el metodo
        //no afecta que este al final o al inicio del codigo
        //el metodo main es como el jefe de los demas, es el que los manda a llamar
        //java va a mandar a llamar(ejecutar) a los que el main solicite
        long salarioBase = 1231231;
        long bonoVentas= 2343453;
        
        long resultadoParaJefe;//casteo implicito, los int caben en los float ya que son mas espacio en memoria
        
        resultadoParaJefe = multiplicar(salarioBase, bonoVentas);//ahora si es para ya darle a pedro lo que tiene que sumar
        System.out.println(resultadoParaJefe);
    }
}