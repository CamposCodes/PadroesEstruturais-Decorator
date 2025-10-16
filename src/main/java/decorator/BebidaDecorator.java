package decorator;

public abstract class BebidaDecorator implements Bebida {

    private Bebida bebida;
    public String descricao;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.bebida.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeIngrediente();

    public String getDescricao() {
        return this.bebida.getDescricao() + " + " + this.getNomeIngrediente();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
