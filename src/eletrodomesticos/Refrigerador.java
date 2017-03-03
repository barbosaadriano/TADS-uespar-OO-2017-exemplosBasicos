/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletrodomesticos;

/**
 *
 * @author Administrador
 */
public abstract class Refrigerador extends Eletrodomestico
        implements Refrigeracao {

    @Override
    public void ligar() {
        if (this.status.equals("Desligado")) {
            this.status = "Ligado";
        }
    }

    @Override
    public void desligar() {
        if (this.status.equals("Ligado")) {
            this.status = "Desligado";
        }
    }

    @Override
    public abstract void refrigerar(float temperatura);
    
}
