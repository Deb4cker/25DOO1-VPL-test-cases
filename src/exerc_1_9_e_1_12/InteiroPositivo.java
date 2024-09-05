package exerc_1_9_e_1_12;

public class InteiroPositivo {

    private int valor;

    public boolean ehImpar(){
        return valor % 2 != 0;
    }

    public int[] getDivisores(){
        if (valor == 0) return new int[]{0};

        int quantidadeDivisores = 0;
        for (int i = 1; i <= valor; i++){
            if (valor % i == 0) quantidadeDivisores++;
        }

        int lastIndexUsed = 0;
        int[] divisores = new int[quantidadeDivisores];
        for (int i = valor; i > 0; i--){
            if (valor % i == 0) {
                divisores[lastIndexUsed] = i;
                lastIndexUsed++;
            }
        }

        return divisores;
    }

    public long fatorial(){
        long resultado = 1;
        for (int i = 1; i <= valor; i++) resultado *= i;
        return resultado;
    }

    public double h(){
        double resultado = 0;
        for (int i = 1; i<= valor; i++) resultado += (double) 1 / i ;
        return resultado;
    }

    public double p(){
        double resultado = 0;
        InteiroPositivo dobro = new InteiroPositivo();

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
