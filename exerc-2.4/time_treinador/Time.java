package time_treinador;

public class Time {

    private final String nome;
    private final int anoFundacao;
    private final String cidadeSede;
    private Treinador treinador;

    public Time(String nome, int anoFundacao, String cidadeSede) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.cidadeSede = cidadeSede;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public String getCidadeSede() {
        return cidadeSede;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public boolean setTreinador(Treinador treinador) {
        boolean treinadorNaoNulo = treinador != null;
        if (treinadorNaoNulo) this.treinador = treinador;
        
        return treinadorNaoNulo;
    }

    @Override
    public String toString() {
        return "Time: " + nome
        + ", Fundacao: " + anoFundacao
        + ", Sede: " + cidadeSede
        + ", Treinador " + treinador.toString();
    }
}
