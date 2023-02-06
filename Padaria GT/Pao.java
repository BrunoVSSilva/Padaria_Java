public abstract class Pao {

    public Pao(){

    }
    public Pao(double valor, int estoque){
        this.valor = valor;
        this.estoque = estoque;
    }

    protected double valor;
    protected int estoque;

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
