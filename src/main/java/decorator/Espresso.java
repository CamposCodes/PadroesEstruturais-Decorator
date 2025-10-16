package decorator;

public class Espresso implements Bebida {

    public float preco;

    public Espresso() {
    }

    public Espresso(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Espresso";
    }

}
