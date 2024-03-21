package Lista;

public class produto {
    private int codProd;
    private double preco;
    private double qtdEstocada;

    public void setProduct() {
        this.codProd = 0;
        this.preco = 0;
        this.qtdEstocada = 0;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQtdEstocada() {
        return qtdEstocada;
    }

    public void setQtdEstocada(double qtdEstocada) {
        this.qtdEstocada = qtdEstocada;
    }
}
