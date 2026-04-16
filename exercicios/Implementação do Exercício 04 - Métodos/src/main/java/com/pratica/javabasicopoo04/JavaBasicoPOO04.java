/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pratica.javabasicopoo04;

/**
 *
 * @author Gabriel Mariano
 */
import java.util.Scanner;
public class JavaBasicoPOO04 {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        verificarPar(numero);

        scanner.close();
    }

    public static void verificarPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}