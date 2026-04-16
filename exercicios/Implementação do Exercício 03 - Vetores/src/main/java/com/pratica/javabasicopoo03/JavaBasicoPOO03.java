/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pratica.javabasicopoo03;

/**
 *
 * @author Gabriel Mariano
 */
import java.util.Scanner;
public class JavaBasicoPOO03 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
        System.out.print("Digite um numero: ");
        numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNumeros digitados:");
        for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
