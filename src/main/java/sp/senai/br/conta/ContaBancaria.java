package sp.senai.br.conta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class ContaBancaria extends BaseContaBancaria{
    
    private boolean ValidarSaque (double valor)
    {
        double totalSaldo = this.saldo = valor;
    
        if(totalSaldo > - 1000){
             return true;
    }
        return false;
    }       
    public void realizarDeposito(double valor)
    {
    this.saldo += valor;
    }
    public void realizarSaque (double valor)
    {
        if (this.ValidarSaque(valor)){
           this.saldo -=valor;
        }else{
           System.out.println("Voce nao possui saldo suficiente");
     }
        
   }

    static class teclado {

        public teclado() {
        }
    }
}