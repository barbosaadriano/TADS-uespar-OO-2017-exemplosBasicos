/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagens.pessoa;

/**
 *
 * @author Administrador
 */
public class Passageiro extends Pessoa {

    public Passageiro() {
        super("Passageiro");
    }

    @Override
    public String getTipo() {
        return "Passageiro";
    }
    
}
