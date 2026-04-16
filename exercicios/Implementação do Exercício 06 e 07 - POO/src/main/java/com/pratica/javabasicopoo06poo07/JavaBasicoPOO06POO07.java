/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pratica.javabasicopoo06poo07;

/**
 *
 * @author Gabriel Mariano
 */
import java.util.Scanner;
public class JavaBasicoPOO06POO07 {

    static class Pessoa {
        String nome;
        int idade;

        public void apresentar() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

       
        System.out.print("Digite o nome da primeira pessoa: ");
        p1.nome = scanner.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        p1.idade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        
        System.out.print("Digite o nome da segunda pessoa: ");
        p2.nome = scanner.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        p2.idade = scanner.nextInt();

   
        System.out.println("\nPessoa 1:");
        p1.apresentar();

        System.out.println("\nPessoa 2:");
        p2.apresentar();

        scanner.close();
    }
}
