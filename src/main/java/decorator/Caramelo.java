package decorator;

public class Caramelo extends BebidaDecorator {

    public Caramelo(Bebida bebida) {
        super(bebida);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeIngrediente() {
        return "Caramelo";
    }
}
