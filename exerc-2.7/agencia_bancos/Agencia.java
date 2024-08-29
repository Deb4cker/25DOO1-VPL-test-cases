package agencia_bancos;

public class Agencia {

    private final int numero;
    private final String cidade;
    private final int anoAbertura;
    
    public Agencia(int numero, String cidade, int anoAbertura) {
        this.numero = numero;
        this.cidade = cidade;
        this.anoAbertura = anoAbertura;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public int getAnoAbertura() {
        return anoAbertura;
    }

    @Override
    public String toString() {
        return "Agencia numero: " + numero
        + ", cidade: " + cidade
        + ", ano: " + anoAbertura;
    }
}
