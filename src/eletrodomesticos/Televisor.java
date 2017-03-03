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
public class Televisor extends Eletrodomestico {

    @Override
    public void ligar() {
        //quando o atributo do super é protected
        if (this.status.equals("Desligado")) {
            System.out.println("Ligando o televisor!!!");
            this.status = "Ligado";
        }
    }

    @Override
    public void desligar() {
        //quando o atributo do pai é private
        if (this.getStatus().equals("Ligado")) {
            System.out.println("Desligando o televisor!!!");
            this.setStatus("Desligado");
        }
    }

}
