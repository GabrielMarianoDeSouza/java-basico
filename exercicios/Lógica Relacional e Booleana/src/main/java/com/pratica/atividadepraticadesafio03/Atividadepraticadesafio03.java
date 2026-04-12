/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pratica.atividadepraticadesafio03;

/**
 *
 * @author Gabriel Mariano
 */
public class Atividadepraticadesafio03 {

    public static void main(String[] args) {
     
        
        int idadeMinima = 18;
        int idadeUsuario = 26;

        
        boolean maiorOuIgual = idadeUsuario >= idadeMinima;
        boolean igual = idadeUsuario == idadeMinima;

      
        System.out.println("Idade do usuario: " + idadeUsuario);
        System.out.println("Maior ou igual a 18: " + (maiorOuIgual ? "Permitido" : "Negado"));
        System.out.println("Idade exatamente 18: " + (igual ? "Permitido" : "Negado"));
    }
}
