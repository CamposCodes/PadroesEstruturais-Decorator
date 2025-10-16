package decorator;

public class Chocolate extends BebidaDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeIngrediente() {
        return "Chocolate";
    }
}
