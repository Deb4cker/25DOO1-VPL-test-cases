package classe_array_inteiros;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInteiros {

    private final int[] array;

    public ArrayInteiros(int tamanho){
        array = new int[tamanho];
    }

    public int[] getArray(){
        return array;
    }

    public String imprimirArray() {
        return Arrays.toString(array).replaceAll("[\\[\\]]", "");
    }

    public boolean setValor(int index, int valor){
        boolean indexValido = index >= 0 && index < array.length;
        if (indexValido) array[index] = valor;
        return indexValido;
    }

    public boolean contem(int numero){
        for (int j : array) if (j == numero) return true;
        return false;
    }

    public int maiorValor(){
        int maiorValor = array[0];
        for (int j : array) maiorValor = Math.max(j, maiorValor);
        return maiorValor;
    }

    public int[] frequenciaAbsoluta(){
        int[] frequencias = new int[101];
        for (int i : array) if (i >= 0 && i <= 100) frequencias[i]++;
        return frequencias;
    }

    public void ordenar(){
        Arrays.sort(array);
    }
    
    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}