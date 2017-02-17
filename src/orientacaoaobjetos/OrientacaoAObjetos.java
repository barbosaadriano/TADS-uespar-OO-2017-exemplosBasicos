/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoaobjetos;

/**
 *
 * @author Administrador
 */
public class OrientacaoAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa titular = new Pessoa();
        titular.nome = "ADRIANO";
        titular.cpf = "111.111.111.11";

        ContaBancaria conta = new ContaBancaria();
        conta.agencia = "2721-9";
        conta.numeroDaConta = "123123123";
        conta.titular = titular;
        conta.alterarSituacao(conta.SITUACAO_ATIVO);
        System.out.println(conta.verificarSaldo());
        System.out.println(conta.titular.nome);
        
        conta.depositar(125.32);
        System.out.println(conta.verificarSaldo());
        conta.sacar(50);
        System.out.println(conta.verificarSaldo());
        
        ContaBancaria destino = new ContaBancaria();
        destino.numeroDaConta = "123";
        destino.agencia = "2222";
        destino.titular = titular;
        
        conta.transferir(70.32, destino);
        
        System.out.println(conta.verificarSaldo());
        System.out.println(destino.verificarSaldo());
        
        
        
    }
    
}
