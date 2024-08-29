import java.util.ArrayList;

public class Clube {

    private final String nome;
    private final String cidade;
    private final ArrayList<Socio> socios;

    public Clube(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        socios = new ArrayList<Socio>();
    }

    public void addSocio(Socio umSocio) {
        socios.add(umSocio);
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public ArrayList<Socio> getSociosMenoresDeIdade() {
        ArrayList<Socio> sociosMenorIdade = new ArrayList<Socio>();
        for (Socio umSocio : this.socios) {
            if (umSocio.getIdade() < 18) sociosMenorIdade.add(umSocio);
        }
        return sociosMenorIdade;
    }

    public double getIdadeMediaSocios() {
        double somaIdades = 0;
        for (Socio umSocio : this.socios) somaIdades += umSocio.getIdade();
        return somaIdades / this.socios.size();
    }

    public ArrayList<Socio> getSociosIdadeMaiorQueMedia() {
        ArrayList<Socio> sociosIdadeMaiorMedia = new ArrayList<Socio>();
        double media = getIdadeMediaSocios();
        for (Socio umSocio : this.socios) {
            if (umSocio.getIdade() > media) sociosIdadeMaiorMedia.add(umSocio);
        }
        return sociosIdadeMaiorMedia;
    }

    public double getArrecadacaoMensalidades() {
        double somaMens = 0;
        for (Socio umSocio : socios) somaMens += umSocio.getValorMensalidade();
        return somaMens;
    }

    public boolean removerSocio(int matricula) {
        Socio procurado = null;
        for (Socio umSocio : socios) {
            if (umSocio.getMatricula() == matricula) procurado = umSocio;
        }
        
        return socios.remove(procurado);
    }

    //Um dia eu ainda coloco StringBuilder nisso aqui ;-;)
    @Override
    public String toString() {
        String texto = "Clube: " + nome + " - " + cidade + "\n";
        for (Socio umSocio : socios) {
            texto = texto + umSocio.toString() + "\n";
        }
        return texto;
    }
}
