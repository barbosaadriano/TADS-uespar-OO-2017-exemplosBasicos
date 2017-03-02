package passagens.services;

import passagens.transacao.Bilhete;

/**
 *
 * @author Administrador
 */
public class ServicoDeImpressao {

    public void imprimirBilhete(Bilhete b) {
        System.out.println("Bilhete número:"+
                b.getNumero());
        System.out.println("Valor: "+b.getValor());
        System.out.println("Poltrona: "+b.getPoltrona());
        System.out.println("Passageiro: "+
                b.getPassageiro().getNome());
        System.out.println("Veículo: "+
                b.getVeiculo().getPlaca());
        System.out.println("Origem: "+
                b.getOrigem().getCidade()+" - "+
                b.getOrigem().getEstado());
        System.out.println("Destino: "+
                b.getDestino().getCidade()+" - "+
                b.getDestino().getEstado());
        
    }
    
}
