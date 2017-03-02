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
public class Aluno implements Lessionar {

    @Override
    public void darAula() {
        System.out.println("Aluno dando aula!");
    }

    @Override
    public void aplicarProva() {
        System.out.println("Aluno Aplicando prova!!");
    }
    
    
    
}
