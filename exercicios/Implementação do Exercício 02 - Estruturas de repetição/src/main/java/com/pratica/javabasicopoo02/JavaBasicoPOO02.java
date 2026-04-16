/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pratica.javabasicopoo02;

/**
 *
 * @author Gabriel Mariano
 */
public class JavaBasicoPOO02 {

    public static void main(String[] args) {
       
        System.out.println("Usando FOR");
        
        for (int i = 1; i <= 9; i++) {
        System.out.println(i);
        }
        System.out.println("\nUsando WHILE");
        int j = 1;
        while (j <= 9) {
        System.out.println(j);
            j++;
        }

        System.out.println("\nUsando DO-WHILE");
        int k = 1;
        do {
        System.out.println(k);
            k++;
        } while (k <= 9);
    }
}
