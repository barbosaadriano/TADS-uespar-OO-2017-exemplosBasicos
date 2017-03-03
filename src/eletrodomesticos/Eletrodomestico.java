package eletrodomesticos;

/**
 *
 * @author Administrador
 */
public abstract class Eletrodomestico {
    /**
     * Ligado ou Desligado
     */
    protected String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Eletrodomestico() {
        this.status =  "Desligado";
    }
    
    public abstract void ligar();
    public abstract void desligar();
    
}
