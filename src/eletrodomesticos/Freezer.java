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
public class Freezer extends Refrigerador {

    @Override
    public void refrigerar(float temperatura) {
        System.out.println("Refrigerando a "+temperatura+" graus");
    }
    
}
