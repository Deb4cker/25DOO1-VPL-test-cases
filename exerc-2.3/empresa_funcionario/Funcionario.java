package empresa_funcionario;

public class Funcionario {

    private final int matricula;
    private String nome;
    private double salario;
    
    public Funcionario(int matricula ) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioMensal() {
        return salario;
    }

    public boolean setNome(String nome) {
        boolean nomeValido = !nome.isBlank();
        if (nomeValido) this.nome = nome;

        return nomeValido;
    }

    public boolean setSalarioMensal(double salario) {
        boolean salarioValido = salario > 0.0;
        if (salarioValido) this.salario = salario;

        return salarioValido;
    }
}
