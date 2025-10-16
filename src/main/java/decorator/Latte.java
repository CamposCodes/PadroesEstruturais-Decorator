package decorator;

public class Latte extends BebidaDecorator {

    public Latte(Bebida bebida) {
        super(bebida);
    }

    public float getPercentualPreco() {
        return 30.0f;
    }

    public String getNomeIngrediente() {
        return "Latte";
    }
}
