/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcv2;

/**
 *
 * @author esteban
 */
public class Suma extends OperacionAritmetica {
    
    //Se implemanta el metodo abstracto de la clase superior
    @Override
    public double calcular(){
        
        //Puedo hacer referencia a las variables pq heredan de la clase superior
        result = num1 + num2;
        return result;
        
    }
    
}
