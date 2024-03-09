package dev.thepaulcode.arrays;

import java.util.Arrays;

public class ReverseArray extends ArrayOperations {

    // Método para inverter um array de inteiros
    public int[] reverseArray(int[] arr) {
        // Copia o array recebido como parâmetro para evitar modificar o original
        int[] myData = Arrays.copyOf(arr, arr.length);
        // Determina o índice do último elemento do array
        int end = myData.length - 1;
        // Cria um novo array com o mesmo tamanho do original
        int[] result = new int[arr.length];

        // Loop para atribuir os elementos do array original em ordem inversa ao novo array
        for (int i = 0; i < myData.length; i++) {
            result[i] = myData[end];
            end--;
        }
        // Retorna o array com os elementos invertidos
        return result;
    }

    // Método principal para demonstrar o uso do método reverseArray
    public static void main(String[] args) {
        // Cria uma instância da classe ReverseArray
        ReverseArray reverse = new ReverseArray();
        // Declara e inicializa um array de inteiros
        int[] myArray = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        // Inverte o array chamando o método reverseArray
        int[] results = reverse.reverseArray(myArray);
        // Imprime os elementos do array invertido
        reverse.printArrayElements(results);
    }
}
