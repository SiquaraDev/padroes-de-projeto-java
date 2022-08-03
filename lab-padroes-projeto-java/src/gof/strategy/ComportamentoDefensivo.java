package gof.strategy;

public class ComportamentoDefensivo implements Comportamento {
    public ComportamentoDefensivo() {
    }

    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
