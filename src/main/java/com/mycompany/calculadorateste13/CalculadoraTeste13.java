/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorateste13;

import java.util.Scanner;

/**
 *
 * @author tayara.5970
 */
public class CalculadoraTeste13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//double num1, num2, num3, num4, num5, media;

    System.out.println("Digite um valor: ");
    double num1 = scanner.nextDouble();
    System.out.println("Digite um valor: ");
    double num2 = scanner.nextDouble();
    System.out.println("Digite outro valor: ");
    double num3 = scanner.nextDouble();
    System.out.println("Digite outro valor: ");
    double num4 = scanner.nextDouble();
    System.out.println("Digite outro valor: ");
    double num5 = scanner.nextDouble();
    System.out.println(" ");
    
   
    double media = (num1 + num2 + num3 + num4 + num5) / 5.0;
    
    System.out.println("A média dos numeros é: " + media);
    scanner.close();
        
    }   
}                
        
        
        
        
        
        
        
        
    
