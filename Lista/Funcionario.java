package Lista;

public class Funcionario {

    private String nome;
    private double salario;

    public void setFuncionario() {
        this.nome = " ";
        this.salario = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
