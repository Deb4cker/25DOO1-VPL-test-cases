package editora_livros;

public class Autor {
    
    private final String nome;
    private String pseudonimo;
    
    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public boolean setPseudonimo(String pseudonimo) {
        boolean pseudonimoValido = pseudonimo != null && !pseudonimo.isBlank();
        if(pseudonimoValido) this.pseudonimo = pseudonimo;
        
        return pseudonimoValido;
    }

    @Override
    public String toString(){
        if(pseudonimo == null) return nome;
        return nome + " ("+pseudonimo+")";
    }
}
