public class Socio {
    private final int matricula;
    private final String nome;
    private int idade;
    private double valorMensalidade;

    public Socio(int matricula, String nome, int idade, double valorMensalidade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.valorMensalidade = valorMensalidade;
    }

    public boolean setIdade(int idade) {
        boolean idadeValida = idade >= 0;
        if (idadeValida) this.idade = idade;
        
        return idadeValida;
    }

    public boolean setValorMensalidade(double valor) {
        boolean valorValido = valor > 0;
        if (valorValido) this.valorMensalidade = valor;

        return valorValido;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula +
               ", Nome: " + nome +
               ", Idade: " + idade +
               ", Mensalidade: " + String.format("%.2f", valorMensalidade);
    }
}
