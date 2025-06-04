/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcular;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Calcular {
    
    
    
    
    public int somar(int a, int b) {
        return a + b; 
    }
    
    
    
    
    public int dividir(int a, int b) {

        
        return a / b; 
    }
    
    
   public int dividirZeros(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Divisão por zero não permitida");
    }

    return a / b;
}

    
  
    
    
    
    public double multiplicar(int a, int b) {
        return a * b; 
    }
    
     public int subtrair(int a, int b) {
        return a - b; 
    }
    
     
      public int potencia (int base, int expoente){
          return (int) Math.pow (base,expoente);                  
      }
    
      
      
  public double raiz(int numero) {
    if (numero < 0) {
        throw new IllegalArgumentException("não e possivel calcular a" +
                "raiz quadrada de numero negativo");
    }

    return Math.sqrt(numero); 
}

}