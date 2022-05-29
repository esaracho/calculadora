/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcv2;

/**
 *
 * @author esteban
 */
public class Division extends OperacionAritmetica{
    
    //Se implemanta el metodo abstracto de la clase superior
    @Override
    public double calcular(){
        //Se lanza excepcion cuando el divisor es cero
        if (num2 == 0){
            throw new ArithmeticException("El divisor no puede ser 0");
        }
        //Puedo hacer referencia a las variables pq heredan de la clase superior
        result = num1 / num2;
        return result;
    }
    
}
