/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pratica.javabasicopoo08;

/**
 *
 * @author Gabriel Mariano
 */
import java.util.Scanner;
public class JavaBasicoPOO08 {

    
    static class Pessoa {
        String nome;
        int idade;

        public void apresentar() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade atual: " + idade);
        }

        public void fazerAniversario() {
            idade++;
        }

        public int idadeAnterior() {
            return idade - 1;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        System.out.print("Digite o nome: ");
        p1.nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        p1.idade = scanner.nextInt();

        System.out.println("\nIdade antes do ultimo aniversario: " + p1.idadeAnterior());

        System.out.println("\nAntes do aniversario:");
        p1.apresentar();

        p1.fazerAniversario();

        System.out.println("\nDepois do aniversario:");
        p1.apresentar();

        scanner.close();
    }
}