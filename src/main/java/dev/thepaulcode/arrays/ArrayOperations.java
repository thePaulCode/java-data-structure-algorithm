package dev.thepaulcode.arrays;

public class ArrayOperations {

    // Método para imprimir os elementos de um array unidimensional
    public void printArrayElements(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            // Imprime cada elemento do array seguido de um espaço
            System.out.print(" \t "+arr[i] + " ");
        }
        // Imprime uma nova linha após imprimir todos os elementos do array
        System.out.println();
    }

    // Método de demonstração das operações em um array
    public void arrayDemo() {
        // Criando um array com capacidade para 5 elementos
        int[] myArray = new int[5];

        // Atribuindo valores aos elementos do array
        myArray[0] = 3;
        myArray[1] = 1;
        myArray[2] = 4;
        myArray[3] = 1;
        myArray[4] = 51;

        // Chamando o método para imprimir os elementos do array
        printArrayElements(myArray);

        // Imprimindo o último elemento do array
        System.out.println("Último elemento do array: " + myArray[myArray.length - 1]);
    }

    // Método principal
    public static void main(String[] args) {
        // Criando uma instância da classe ArrayOperations
        ArrayOperations arrayUtil = new ArrayOperations();
        // Chamando o método de demonstração das operações em um array
        arrayUtil.arrayDemo();
    }
}
