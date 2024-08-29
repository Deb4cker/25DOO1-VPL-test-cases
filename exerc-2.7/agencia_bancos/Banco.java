package agencia_bancos;

import java.util.ArrayList;

public class Banco {
    
    private int codigo;
    private String nome;
    private final ArrayList<Agencia> agencias;
    
    public Banco(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        agencias = new ArrayList<>();
    }

    public boolean addAgencia(Agencia agencia){
        return agencias.add(agencia);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public boolean setCodigo(int codigo){
        boolean codigoValido = codigo > 0;
        if (codigoValido) this.codigo = codigo;

        return codigoValido;
    }

    public boolean setNome(String nome) {
        boolean nomeValido = !nome.isBlank();
        if(nomeValido) this.nome = nome;
        
        return nomeValido;
    }
    
    // sobrecarga de metodo
    public ArrayList<Agencia> getAgencias(String cidade){
        ArrayList<Agencia> agenciasCidade = new ArrayList<Agencia>();
        for(Agencia umaAg : agencias){
            if (umaAg.getCidade().equals(cidade)) agenciasCidade.add(umaAg);
        }
        return agenciasCidade;
    }
    
    // sobrecarga de metodo
    public ArrayList<Agencia> getAgencias(int anoAbertura){
        ArrayList<Agencia> agenciasAno = new ArrayList<Agencia>();
        for(Agencia umaAg : agencias){
            if (umaAg.getAnoAbertura() == anoAbertura) agenciasAno.add(umaAg);
        }
        return agenciasAno;
    }
    
     // sobrecarga de metodo
    public void imprimirAgencias(){
        System.out.println("Banco: " + codigo + " - " + nome);
        agencias.forEach(umaAg -> System.out.println(umaAg));
    }
    
    // sobrecarga de metodo
    public void imprimirAgencias(String cidade){
        System.out.println("Banco: " + codigo + " - " + nome);
        ArrayList<Agencia> agenciasCidade = getAgencias(cidade);
        agenciasCidade.forEach(umaAg -> System.out.println(umaAg));
    }
    
     // sobrecarga de metodo
    public void imprimirAgencias(int anoAbertura){
        System.out.println("Banco: "+ codigo + " - "+ nome);
        ArrayList<Agencia> agenciasAno = getAgencias(anoAbertura);
        agenciasAno.forEach(umaAg -> System.out.println(umaAg));
    }
    
    public Agencia getAgencia(int numero){
        Agencia procurada = null;
        for(Agencia umaAgencia : agencias){
            if (umaAgencia.getNumero() == numero ) {
                procurada = umaAgencia;
                break;
            }
        }
        return procurada;
    }  
}
