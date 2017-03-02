/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagens.transacao;

import java.util.Date;
import orientacaoaobjetos.Pessoa;
import passagens.local.Local;
import passagens.pessoa.Passageiro;
import passagens.veiculo.Veiculo;


/**
 *
 * @author Administrador
 */
public class Bilhete {
    /**
     * Passageiro
     */
    private Passageiro passageiro;
    /**
     * Funcionario
     */
    private Pessoa funcionario;
    /**
     * Veiculo
     */
    private Veiculo veiculo;
    /**
     * Origem
     */
    private Local origem;
    /**
     * Destino
     */
    private Local destino;
    
    private long numero;
    private double valor;
    private Date dataHora;
    private int poltrona;

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Local getOrigem() {
        return origem;
    }

    public void setOrigem(Local origem) {
        this.origem = origem;
    }

    public Local getDestino() {
        return destino;
    }

    public void setDestino(Local destino) {
        this.destino = destino;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    
    
}
