package time_treinador;

public class Treinador {

    private final String cpf;
    private final String nome;
    private double salario;

    public Treinador(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public boolean setSalario(double salario) {
        boolean salarioValido = salario > 0.0;
        if(salarioValido) this.salario = salario;
        
        return salarioValido;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf + ", Nome: " + nome + ", Salario mensal: " + String.format("%.2f", salario);
    }
}