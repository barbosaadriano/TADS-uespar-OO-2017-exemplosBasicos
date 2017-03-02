/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagens.veiculo;

/**
 *
 * @author Administrador
 */
public class Veiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private String renavam;
    private long kmRodado;
    private int capacidade;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public long getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(long kmRodado) {
        this.kmRodado = kmRodado;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
