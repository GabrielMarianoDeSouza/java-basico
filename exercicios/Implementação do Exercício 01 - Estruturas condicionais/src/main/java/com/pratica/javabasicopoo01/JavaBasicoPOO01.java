/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pratica.javabasicopoo01;

/**
 *
 * @author Gabriel Mariano
 */

import java.util.Scanner;
public class JavaBasicoPOO01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Numero positivo");
        } else if (numero < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero e zero");
        }

        switch (numero) {
            case 1:
                System.out.println("Voce digitou o numero um");
                break;
            case 2:
                System.out.println("Voce digitou o numero dois");
                break;
            case 3:
                System.out.println("Voce digitou o numero tres");
                break;
            case 4:
                System.out.println("Voce digitou o numero quatro");
                break;
                case 5:
                System.out.println("Voce digitou o numero cinco");
                break;
            default:
                System.out.println("Numero fora do intervalo de 1 a 5");
        }

        scanner.close();
    }
}
