package orientacaoaobjetos;

/**
 *
 * @author Administrador
 */
public class ContaBancaria {

    public final char SITUACAO_ATIVO = 'A';

    public String numeroDaConta;
    public String agencia;
    public Pessoa titular;
    //public double saldo;
    public float saldo;
    public char situacao;

    public float verificarSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean transferir(double valor, ContaBancaria destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public char verificarSituacao() {
        return this.situacao;
    }

    public void alterarSituacao(char novaSituacao) {
        this.situacao = novaSituacao;
    }

}
