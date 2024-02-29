package dev.thepaulcode.polynomialalgorithm;

/**
 * Classe para demonstrar um algoritmo com complexidade polinomial.
 * Este algoritmo imprime todas as combinações possíveis de dois números de 1 a n.
 * Conforme o valor de n aumenta, o tempo de execução do algoritmo cresce de forma significativa.
 */
public class CalculatingTimeComplexityPolynomial {

    /**
     * Método para imprimir todas as combinações possíveis de dois números de 1 a n.
     *
     * @param n O valor máximo para os números.
     */
    public void print(int n) {
        // Loop externo para iterar de 1 a n.
        for(int i=1; i <= n; i++){
            // Loop interno para iterar de 1 a n.
            for(int j=1; j <= n; j++){
                // Imprime a combinação de i e j.
                System.out.println("i= " + i + ", j= " + j);
            }
            // Mensagem indicando o fim do loop interno.
            System.out.println("End of inner loop.");
        }
        // Mensagem indicando o fim do loop externo.
        System.out.println("End of outer loop.");
    }
}
