package classe_inteiro_positivo;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class InteiroPositivoAvancadoTest
{
    private static final double DELTA = 0.0001;
    private String mensagemBase; //Variável de escopo para a mensagem formatada;
    private String mensagem;     //Variável de escopo para a mensagem da assertiva;

    @Test
    public void deveSerPositivo() {
        mensagemBase = "O inteiro positivo não deve ser negativo, porém, o construtor da classe permitiu que %d fosse considerado um valor!";
        int[] valoresDeTeste = new int[]{10, -2, -8, 0, 12092};

        boolean ehNegativo;
        InteiroPositivo inteiroPositivo;
        for (int valor : valoresDeTeste){
            inteiroPositivo = new InteiroPositivo(valor);
            ehNegativo = inteiroPositivo.getValor() < 0;
            mensagem = String.format(mensagemBase, valor);
            assertFalse(mensagem, ehNegativo);
        }

    }

    @Test
    public void naoDeveAlterarQuandoForNegativo() {
        InteiroPositivo numero = new InteiroPositivo(5);

        boolean alterouComInputNegativo = numero.setValor(-18);
        boolean alterouComInputPositivo = numero.setValor(120);

        assertFalse("Não deve alterar com input negativo.", alterouComInputNegativo);
        assertTrue("Deve alterar com input positivo.", alterouComInputPositivo);
    }

    @Test
    public void deveRetornarSeEhImpar() {
        mensagemBase = "É %s que %d é impar!";
        final int[] valoresDeTeste = new int[]{10, 2, 7, 0, 12095};

        InteiroPositivo inteiroPositivo = new InteiroPositivo(1);
        boolean ehImpar;

        for (int valor : valoresDeTeste) {
            ehImpar = valor % 2 != 0;
            inteiroPositivo.setValor(valor);
            mensagem = String.format(mensagemBase, ehImpar ? "verdadeiro" : "falso", valor);
            assertEquals(mensagem, ehImpar, inteiroPositivo.ehImpar());
        }
    }

    @Test
    public void deveRetornarArrayDeDivisoresCorretamente() {
        mensagemBase = "Array incorreto! \nNúmero testado: %d \nEsperado %s \nRetornou: %s";
        int[] valoresTeste = new int[]{12, 36, 0, 7, 8, 41, 57, 13, 11, 5, 19, 24, 76, 22, 100};
        Map<Integer, int[]> tabelaDivisores = gerarTabelaDivisores();

        int[] arrayEsperado;
        int[] arrayGerado;
        InteiroPositivo inteiroPositivo = new InteiroPositivo(0);
        for (int valor : valoresTeste){
            inteiroPositivo.setValor(valor);
            arrayEsperado = tabelaDivisores.get(valor);
            arrayGerado = inteiroPositivo.getDivisores();
            mensagem = String.format(mensagemBase, valor, Arrays.toString(arrayEsperado), Arrays.toString(arrayGerado));
            assertArrayEquals(mensagem, arrayEsperado, arrayGerado);
        }
    }

    @Test
    public void deveRetornarFatorialCorreto() {
        InteiroPositivo inteiroPositivo = new InteiroPositivo(0);
        int[] fatoriaisDeZeroADez = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};

        long fatorialEsperado;
        for (int i = 0; i < fatoriaisDeZeroADez.length; i++) {
            inteiroPositivo.setValor(i);
            fatorialEsperado = fatoriaisDeZeroADez[i];
            assertEquals(fatorialEsperado, inteiroPositivo.fatorial());
        }
    }

    @Test
    public void deveRetornarFuncaoHCorreta() {
        mensagemBase = "h(%d) deve ser igual a %.4f";
        double[] resultadosEsperados = {
                0,      //i = 00;
                1,      //i = 01;
                1.5,    //i = 02;
                1.8333, //i = 03;
                2.0833, //i = 04;
                2.2833, //i = 05;
                2.45,   //i = 06;
                2.5928, //i = 07;
                2.7178, //i = 08;
                2.8289, //i = 09;
                2.9289  //i = 10;
        };

        InteiroPositivo inteiroPositivo = new InteiroPositivo(0);

        double hx;
        double resultadoEsperado;
        for (int i = 0; i < resultadosEsperados.length; i++) {
            inteiroPositivo.setValor(i);
            hx = inteiroPositivo.funcaoH();
            resultadoEsperado = resultadosEsperados[i];
            mensagem = String.format(mensagemBase, i, resultadoEsperado);
            assertEquals(mensagem, resultadoEsperado, hx, DELTA);
        }
    }

    @Test
    public void deveRetornarFuncaoPCorreta() {
        mensagemBase = "p(%d) deve ser igual a %.4f";
        final double[] resultadosEsperados = {
                0,           //i = 00;
                0.5,         //i = 01;
                0.4166,      //i = 02;
                0.4208,      //i = 03;
                0.420734127, //i = 04;
                0.420735505, //i = 05;
                0.420735492, //i = 06; #Daqui para baixo a calculadora não alcançava mais casas U_U;
                0.420735492, //i = 07;
                0.420735492, //i = 08;
                0.420735492, //i = 09;
                0.420735492  //i = 10;
        };

        InteiroPositivo numero = new InteiroPositivo(0);
        double px;
        double resultadoEsperado;
        for (int i = 0; i < resultadosEsperados.length; i++) {
            numero.setValor(i);
            px = numero.funcaoP();
            resultadoEsperado = resultadosEsperados[i];
            mensagem = String.format(mensagemBase, i, resultadoEsperado);
            assertEquals(mensagem, resultadoEsperado, px, DELTA);
        }
    }

    @Test
    public void deveRetornarRaizQuadradaCorretamente() {
        mensagemBase = "A raiz quadrada de %d é %d";
        final int iNumero = 0;
        final int iRaiz = 1;

        final int[][] raizes = new int[][]{
                new int[]{9, 3},
                new int[]{25, 5},
                new int[]{144, 12},
                new int[]{145_161, 381},
                new int[]{21_206_025, 4605}
        };

        InteiroPositivo numero;
        int numeroReal;
        int raiz;
        for (int[] tupla : raizes) {
            numeroReal = tupla[iNumero];
            numero = new InteiroPositivo(tupla[iNumero]);
            raiz = tupla[iRaiz];
            mensagem = String.format(mensagemBase, numeroReal, raiz);
            assertEquals(mensagem, raiz, numero.raizQuadrada(), DELTA);
        }
    }

    private Map<Integer, int[]> gerarTabelaDivisores() {
        int[] valoresTeste = new int[]{12, 36, 0, 7, 8, 41, 57, 13, 11, 5, 19, 24, 76, 22, 100};

        Map<Integer, int[]> tabelaDivisores = new HashMap<>();
        tabelaDivisores.put(valoresTeste[0], new int[]{12, 6, 4, 3, 2, 1});
        tabelaDivisores.put(valoresTeste[1], new int[]{36, 18, 12, 9, 6, 4, 3, 2, 1});
        tabelaDivisores.put(valoresTeste[2], new int[]{0});
        tabelaDivisores.put(valoresTeste[3], new int[]{7, 1});
        tabelaDivisores.put(valoresTeste[4], new int[]{8, 4, 2, 1});
        tabelaDivisores.put(valoresTeste[5], new int[]{41, 1});
        tabelaDivisores.put(valoresTeste[6], new int[]{57, 19, 3, 1});
        tabelaDivisores.put(valoresTeste[7], new int[]{13, 1});
        tabelaDivisores.put(valoresTeste[8], new int[]{11, 1});
        tabelaDivisores.put(valoresTeste[9], new int[]{5, 1});
        tabelaDivisores.put(valoresTeste[10], new int[]{19, 1});
        tabelaDivisores.put(valoresTeste[11], new int[]{24, 12, 8, 6, 4, 3, 2, 1});
        tabelaDivisores.put(valoresTeste[12], new int[]{76, 38, 19, 4, 2, 1});
        tabelaDivisores.put(valoresTeste[13], new int[]{22, 11, 2, 1});
        tabelaDivisores.put(valoresTeste[14], new int[]{100, 50, 25, 20, 10, 5, 4, 2, 1});

        return tabelaDivisores;
    }
}
