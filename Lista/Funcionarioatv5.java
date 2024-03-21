package Lista;

public class Funcionarioatv5 {
    private String nome;
    private float salarioBruto;
    private float imposto;
    private float salarioLiquido;

    public void setFuncionarioatv() {
        this.nome = "";
        this.salarioBruto = 0;
        this.imposto = 0;
        this.salarioLiquido = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public void setSalarioLiquido(float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public String getNome() {
        return nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public float getImposto() {
        return imposto;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    @Override
    public String toString() {
        return "--FOLHA DE PAGAMENTO--" + "\n " + "Nome: " + getNome() + "\n" +
                "Valor do imposto: " + getImposto() + "\n" +
                "Valor líquido a receber: " + (getSalarioBruto() - getImposto());
    }
}
