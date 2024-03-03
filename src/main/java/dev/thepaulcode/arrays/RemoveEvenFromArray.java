package dev.thepaulcode.arrays;

// Classe RemoveEvenFromArray
public class RemoveEvenFromArray {

    // Método para imprimir um array de inteiros
    public static void printArray(int[] arr) {
        int n = arr.length; // Obtém o tamanho do array
        for (int i = 0; i < n; i++) { // Itera sobre cada elemento do array
            System.out.print(arr[i] + " "); // Imprime o elemento atual do array seguido de um espaço
        }
        System.out.println(""); // Imprime uma nova linha após imprimir todos os elementos do array
    }

    // Método para remover números pares de um array de inteiros
    public static int[] removeEven(int[] arr) {
        int n = arr.length; // Obtém o tamanho do array
        int oddCount = 0; // Variável para contar o número de elementos ímpares no array

        int idx = 0; // Índice para rastrear a posição do próximo elemento ímpar no novo array resultante

        // Conta o número de elementos ímpares no array original
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) { // Verifica se o elemento atual é ímpar
                oddCount++; // Incrementa o contador de elementos ímpares
            }
        }

        // Cria um novo array para armazenar os elementos ímpares
        int[] result = new int[oddCount];

        // Itera sobre o array original para copiar os elementos ímpares para o novo array resultante
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) { // Verifica se o elemento atual é ímpar
                result[idx] = arr[i]; // Copia o elemento ímpar para o novo array
                idx++; // Incrementa o índice do novo array
            }
        }

        return result; // Retorna o novo array contendo apenas os elementos ímpares do array original
    }

    // Método principal, onde o programa começa a ser executado
    public static void main(String[] args) {

        int[] myArray = {2, 3, 4, 5, 6, 7, 8, 9}; // Declara e inicializa um array de inteiros
        printArray(myArray); // Chama o método para imprimir o array original
        int[] result = removeEven(myArray); // Chama o método para remover os números pares do array
        printArray(result); // Chama o método para imprimir o novo array contendo apenas os números ímpares
    }
}
