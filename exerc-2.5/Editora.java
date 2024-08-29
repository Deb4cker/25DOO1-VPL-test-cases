public class Editora {
    
    private final String nome;
    private final String cidade;
    
    public Editora(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String toString() {
        return nome+" ("+ cidade +")";
    }
}
