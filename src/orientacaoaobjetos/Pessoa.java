/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoaobjetos;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Pessoa implements Lessionar {

    private String nome;
    private double altura;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if (idade>150) {
            throw new Exception("Idade maior do que o permitido!");
        }
        this.idade = idade;
    }

    @Override
    public void darAula() {
        System.out.println("teste");
        System.out.println("Estou dando aula!!");
    }

    @Override
    public void aplicarProva() {
        System.out.println("Estou aplicando prova!!");
    }
}
