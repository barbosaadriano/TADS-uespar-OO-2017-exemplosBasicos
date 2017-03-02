/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoaobjetos;

import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.codegen.CompilerConstants;
import passagens.local.Local;
import passagens.pessoa.Passageiro;
import passagens.services.ServicoDeImpressao;
import passagens.transacao.Bilhete;
import passagens.veiculo.Veiculo;

/**
 *
 * @author Administrador
 */
public class OrientacaoAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca("AXD-1023");
        
        Passageiro passageiro = new Passageiro();
        passageiro.setNome("Adriano");
        
        Local origem =  new Local();
        origem.setCidade("Terra Roxa");
        origem.setEstado("PR");
        
        Local destino = new Local();
        destino.setCidade("Palotina");
        destino.setEstado("PR");
        
        Bilhete bilhete = new Bilhete();
        bilhete.setNumero(1);
        bilhete.setPoltrona(10);
        bilhete.setPassageiro(passageiro);
        bilhete.setOrigem(origem);
        bilhete.setDestino(destino);
        bilhete.setVeiculo(veiculo);
        
        ServicoDeImpressao si = new ServicoDeImpressao();
        si.imprimirBilhete(bilhete);

    }
    
}
