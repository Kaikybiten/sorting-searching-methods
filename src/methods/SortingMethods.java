package methods;

public class SortingMethods {

    static int bubbleSort(int[] list) {

        int high; // Variavel que guardará o maior numero atualmente.
        int operationCounter = 0; // Contador de operações.

        for (int i = 0; i < list.length - 1; i++) { // Iterador externo.

            /*  O "i" no laço externo serve para garantir que os números já ordenados no final da lista não
            sejam comparados novamente. A cada iteração, o maior número da parte não ordenada do array
            "borbulha" para sua posição correta, que é a última disponível na lista.
                Por isso, o laço interno percorre até (list.length - i), pois os últimos elementos já estão
            ordenados. */

            for (int j = 1; j < list.length - i; j++) { // Iterador interno.

                operationCounter++;

                // compara pares de elementos consecutivos [n0 > n1], [n1 > n2], [n2 > n3], [n3 > n4]...
                if (list[j - 1] > list[j]) {

                    high = list[j - 1];  // Armazena temporariamente o maior número atual.
                    list[j - 1] = list[j];  // Coloca o menor número na posição n1 da comparação.
                    list[j] = high;  // Guarda o maior número na posição n2 da comparação.
                }
            }
        }

        return operationCounter;
    }
}

