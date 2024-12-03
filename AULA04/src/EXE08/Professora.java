package EXE08;

public class Professora {
    private String nome;
    private String disciplina;
    private double salario;

    public Professora(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null && !disciplina.isEmpty()) {
            this.disciplina = disciplina;
        }
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public void aula() {
        System.out.println("O(a) professor(a) " + nome + " está dando aula agora de " + disciplina);
    }

    public void prova() {
        System.out.println("O(a) professor(a) " + nome + " está corrigindo provas agora!");
    }
}
