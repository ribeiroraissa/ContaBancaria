package sp.senai.br.conta;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Main {
      public void menu() {
      } 
       public static void main (String args []){
        Scanner teclado = new Scanner(System.in);
        
        ContaBancaria contaBancaria = new ContaBancaria();
       
        System.out.println("por favor insira o número da sua conta...");
        ContaBancaria.teclado.nextInt();
        
        System.out.println("por favor insira o número da sua agencia...");
        ContaBancaria.teclado.nextInt();
      
        
        System.out.printf("saldo atual:%f\n "+ "Limite disponivel:%f\n" + "valor sacado:%f",
        contaBancaria.getSaldo(),contaBancaria.getLimiteDisponivel(),
        2000.00);
    }
}
