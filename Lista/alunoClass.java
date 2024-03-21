package Lista;

public class alunoClass {
    private String nome;
    private double notaFinal;

    public void setAluno() {
        this.nome = "";
        this.notaFinal = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

}
