package comissao_deputados;

public class Deputado
{
    private int matricula;
    private String nome;
    private int partido;
    private String estado;
    
    public Deputado(int matricula, String nome, int partido, String estado){
        this.matricula = matricula;
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
    }
    
    public boolean setPartido(int partido){
        boolean partidoValido = partido >= 10 && partido <= 99;
        if (partidoValido) this.partido = partido;
        
        return partidoValido;
    }
    
    public String toString(){
        return "Matricula: "+ matricula +", Nome: "+ nome +"Partido: "+ partido +", Estado: "+ estado;
    }  
    
    public int getMatricula(){
        return matricula;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getPartido(){
        return partido;
    }
    
    public String getEstado(){
        return estado;
    }
}
