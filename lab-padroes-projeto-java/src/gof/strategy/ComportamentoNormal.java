package gof.strategy;

public class ComportamentoNormal implements Comportamento {
    public ComportamentoNormal() {
    }

    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}