package comissao_deputados;

import java.util.ArrayList;

public class Comissao
{
    private String titulo;
    private ArrayList<Deputado> deputados;
    
    public Comissao(String titulo){
        this.titulo = titulo;
        this.deputados = new ArrayList<Deputado>();
    }
    
    public boolean setTitulo(String titulo){
        boolean tituloValido = !titulo.isBlank();
        if (tituloValido) this.titulo = titulo;
        
        return tituloValido;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void addDeputado(Deputado umDep){
        deputados.add(umDep);
    }
    
    public ArrayList<Deputado> getDeputados(){
        return deputados;
    }
    
    public ArrayList<Deputado> getDeputados(int partido){
        ArrayList<Deputado> depsPartido = new ArrayList<>();
        for (Deputado umDep : deputados){
            if (umDep.getPartido() == partido) depsPartido.add(umDep);
        }

        return depsPartido;
    }
    
    public ArrayList<Deputado> getDeputados(String estado){
        ArrayList<Deputado> depsEstado = new ArrayList<Deputado>();
        for (Deputado umDep : deputados){
            if (umDep.getEstado().equals(estado)) depsEstado.add(umDep);
        }
        return depsEstado;
    }
    
    public void imprimirDeputados(){
        System.out.println("Titulo: " + titulo);
        deputados.forEach(umDep -> System.out.println(umDep));
    }
    
    public void imprimirDeputados(int partido){
         System.out.println("Titulo: " + titulo);
         ArrayList<Deputado> depsPartido = getDeputados(partido);
         depsPartido.forEach(umDep -> System.out.println(umDep));
    }
    
    public void imprimirDeputados(String estado){
        System.out.println("Titulo: " + titulo);
        ArrayList<Deputado> depsEstado = getDeputados(estado);
        depsEstado.forEach(umDep -> System.out.println(umDep));
    } 
}
