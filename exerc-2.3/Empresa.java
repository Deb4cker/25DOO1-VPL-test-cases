import java.util.ArrayList;

public class Empresa {

    private final String cnpj;
    private final String razaoSocial;
    private final ArrayList<Funcionario> funcionarios;
    
    public Empresa(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.funcionarios = new ArrayList<>();
    }

    public boolean addFuncionario(Funcionario funcionario){
        return funcionarios.add(funcionario);
    }

    public boolean removeFuncionario(Funcionario funcionario){
        return funcionarios.remove(funcionario);
    }

    public void imprimeFuncionarios(){
        for (Funcionario fun : funcionarios){
             System.out.println("Matricula: "+fun.getMatricula());
             System.out.println("Nome: "+fun.getNome());
             System.out.println("Sal´ario: "+fun.getSalarioMensal());
        }
    }

    public double getDespesasFolhaPagamento(){
        double total = 0.0;
        for (Funcionario funcionario : funcionarios) total += funcionario.getSalarioMensal();
        return total;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
}
