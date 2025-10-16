package decorator;

public class Chantilly extends BebidaDecorator {

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    public float getPercentualPreco() {
        return 15.0f;
    }

    public String getNomeIngrediente() {
        return "Chantilly";
    }
}
