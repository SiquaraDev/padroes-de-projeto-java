package gof.strategy;

public class ComportamentoAgressivo implements Comportamento {
    public ComportamentoAgressivo() {
    }

    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
