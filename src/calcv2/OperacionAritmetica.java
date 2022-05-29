/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcv2;


public abstract class OperacionAritmetica {
    
    //Atributos de la clase, modificador de acceso protected para que las clases hijas puedan acceder
    protected double num1;
    protected double num2;
    protected double result;
    
    //Constructor pone los atributos a cero
    public OperacionAritmetica() {
        
        this.num1 = 0;
        this.num2 = 0;
        this.result = 0;
    }
    
    //Metodo abstracto, las clases hijas deben implementarlo
    public abstract double calcular();
    
    //getters y setters   
    public void setNum1(double num1){
        
        this.num1 = num1;
        
    }
    
    public void setNum2(double num2){
        
        this.num2 = num2;
        
    }
    
    public double getResult(){
       
        return this.result;
    
    }
    
}
