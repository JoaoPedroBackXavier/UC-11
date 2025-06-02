/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class calculadora {
    
    public static int somar(int a, int b){
        return a + b;
    }
    
    public static int subtrair(int a, int b){
        return a - b;
    }
    
    public static int dividir(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a/b;
    }
    
    
    
}
