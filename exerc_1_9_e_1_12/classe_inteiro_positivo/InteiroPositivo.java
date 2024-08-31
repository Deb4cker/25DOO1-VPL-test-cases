package classe_inteiro_positivo;

import java.util.ArrayList;
import java.util.List;

public class InteiroPositivo {

    private int valor;

    public InteiroPositivo(int valor) {
        this.valor = Math.max(valor, 0);
    }

    public boolean ehImpar(){
        return valor % 2 != 0;
    }

    public int[] getDivisores(){
        if (valor == 0) return new int[]{0};

        int raizQuadrada = (int) Math.sqrt(valor);
        List<Integer> listaDivisores = new ArrayList<>();
        for (int i = 1; i <= raizQuadrada; i++) {
            if (valor % i == 0) {
                listaDivisores.add(i);
                if (i != valor / i)
                    listaDivisores.add(valor / i);
            }
        }

        listaDivisores.sort((x, y) -> y - x);
        listaDivisores.reversed();
        return listaDivisores.stream().mapToInt(i -> i).toArray();
    }

    public long fatorial(){
        long resultado = 1;
        for (int i = 1; i <= valor; i++) resultado *= i;
        return resultado;
    }

    public double funcaoH(){
        double resultado = 0;
        for (int i = 1; i<= valor; i++) resultado += (double) 1 / i ;
        return resultado;
    }

    public double funcaoP(){
        double resultado = 0;
        InteiroPositivo dobro = new InteiroPositivo(0);

        for (int i = 1; i <= valor; i++){
            dobro.setValor(i*2);

            if (i % 2 != 0)
                resultado += (double)i/dobro.fatorial();
            else
                resultado -= (double)i/dobro.fatorial();

        }

        return resultado;
    }

    public double raizQuadrada(){
        return Math.sqrt(valor);
    }

    public int getValor() {
        return valor;
    }

    public boolean setValor(int valor) {
        boolean ehPositivo = valor >= 0;
        if (ehPositivo) this.valor = valor;

        return ehPositivo;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
