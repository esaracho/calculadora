/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcv2;
import java.util.Scanner;
/**
 *
 * @author esteban
 */
public class PruebaCalcv2 {

 
    public static void main(String[] args) {
        
        //Se instancian los objetos de las operaciones como una clase OperacionAritmetica que es su superior (polimorfismo)
        OperacionAritmetica suma = new Suma();
        OperacionAritmetica resta = new Resta();
        OperacionAritmetica multi = new Multiplicacion();
        OperacionAritmetica div = new Division();
        
        //variables a usar en las operaciones
        double num1, num2;
        //variable de opcion, se inicia con cualquier valor distinto de x para que entre en el while
        char opcion = 'c';
        Scanner entrada = new Scanner(System.in);
        //se pide el primer numero del calculo
        System.out.print("Numero: ");
        num1 = entrada.nextDouble();
        
        //while - switch con opciones en char
        while (opcion != 'x') {
            
            System.out.print("Operacion | + | - | / | * | r (reiniciar) | x (cerrar) | : ");
            //Se toma de entrada una cadena, con el metodo carAt(0) se toma el primer char
            opcion = entrada.next().charAt(0);
            
            switch (opcion) {
                
                case '+': {
                    System.out.print(num1 + " + : ");
                    num2 = entrada.nextDouble();
                    suma.num1 = num1;
                    suma.num2 = num2;
                    System.out.println("resultado: "+ suma.calcular());
                    //num1 pasa a valer el resultado para continuar con el calculo
                    num1 = suma.getResult();
                    break;
                }
                
                case '-': {
                    System.out.print(num1 + " - : ");
                    num2 = entrada.nextDouble();
                    resta.num1 = num1;
                    resta.num2 = num2;
                    System.out.println("resultado: "+ resta.calcular());
                    num1 = resta.getResult();
                    break;
                }
                
                case '/': {
                    System.out.print(num1 + " / : ");
                    num2 = entrada.nextDouble();
                    div.num1 = num1;
                    div.num2 = num2;
                    //try-catch por error division por cero
                    try {
                    System.out.println("resultado: "+ div.calcular());
                    num1 = div.getResult();
                    }
                    catch (Exception e) {
                        System.out.println(e);
                        
                    }
                    break;
                }
                
                case '*': {
                    System.out.print(num1 + " * : ");
                    num2 = entrada.nextDouble();
                    multi.num1 = num1;
                    multi.num2 = num2;
                    System.out.println("resultado: "+ multi.calcular());
                    num1 = multi.getResult();
                    break;
                }
                
                case 'r': {
                    //Se pide un nuevo valor para num1 para reiniciar el calculo
                    System.out.print("Numero: ");
                    num1 = entrada.nextDouble();
                    break;
                }
                
                case 'x': System.out.println("Saliendo"); break;
                
                default: System.out.println("Opcion incorrecta");
                
            }
        }

        
    }
    
}
