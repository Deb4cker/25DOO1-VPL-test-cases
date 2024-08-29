package editora_livros;

import java.util.ArrayList;

public class Livro {

    private final String titulo;
    private final int ano;
    private final int paginas;
    private final ArrayList<Autor> autores;
    private Editora editora;
    
    public Livro(String titulo, int ano, int paginas) {
        this.titulo = titulo;
        this.ano = ano;
        this.paginas = paginas;
        this.autores = new ArrayList<>();
    }

    public boolean setEditora(Editora editora){
        boolean editoraNaoNula = editora != null;
        if (editoraNaoNula) this.editora = editora;

        return editoraNaoNula;
    }

    public boolean addAutor(Autor autor){
        return autores.add(autor);
    }

    public boolean removeAutor(Autor autor){
        return autores.remove(autor);
    }

    public Editora getEditora(){
        return editora;
    }

    public ArrayList<Autor> geAutores(){
        return autores;
    }

    //Por favor Fernando, me deixa usar StringBuilder! ._.)
    @Override
    public String toString() {
        String texto = 
          "Titulo: "+ titulo + ", Ano: "+ ano+", Paginas: "+ paginas + "\n" 
        + "Autor(es):\n";
        
        for(Autor umAutor : autores) texto = texto +umAutor.toString()+"\n";
        
        texto = texto + "Editora:\n" + editora.toString();
        return texto;
    }
}
