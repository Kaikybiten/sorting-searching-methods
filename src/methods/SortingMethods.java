package methods;

public class SortingMethods {

    static public int bubbleSort (int[] list) {

        int operationCounter = 0; // Contador de operações.

        for (int i = 0; i < list.length - 1; i++) { // Iterador externo.

            boolean swap = false; // Variavel que verificará se houve alguma realocação entre os elementos

            /*  O "i" no laço externo serve para garantir que os números já ordenados no final da lista não
            sejam comparados novamente. A cada iteração, o maior número da parte não ordenada do array
            "borbulha" para sua posição correta, que é a última disponível na lista.
                Por isso, o laço interno percorre até (list.length - i), pois os últimos elementos já estão
            ordenados. */


            for (int j = 1; j < list.length - i; j++) { // Iterador interno.
                /* O último item da lista estará ordenado automaticamente quando todos
                os outros já estiverem no lugar. Por isso (list.length -i). */


                operationCounter++;

                // compara pares de elementos consecutivos [n0 > n1], [n1 > n2], [n2 > n3], [n3 > n4]...
                if (list[j - 1] > list[j]) {

                    int high = list[j - 1];  // Armazena temporariamente o maior número atual.
                    list[j - 1] = list[j];  // Coloca o menor número na posição n1 da comparação.
                    list[j] = high;  // Guarda o maior número na posição n2 da comparação.

                    swap = true; // Ocorreu uma alocação.
                }
            }

            // Se nenhum dos elementos tiver sido realocado na iteração interna, significa que o array esta ordenado
            if (!swap){
                break;

            }
        }

        return operationCounter;
    }

    static public int insertionSort(int[] list) {
        int operationCounter = 0; // Contador de operações

        for (int i = 1; i < list.length; i++) {

            int key = list[i]; // Guarda o elemento da esquerda que ainda não foi ordenado
            int j = i - 1;

            while (j >= 0 && list[j] > key) {

                // Move os elementos para a direita, criando espaço para inserir a chave (key) na posição correta
                list[j + 1] = list[j];

                // Decrementa o índice j para percorrer os elementos à esquerda de 'key'
                j = j - 1;

                operationCounter++;  // Conta a operação de troca/movimentação
            }

            list[j + 1] = key;  // Coloca a chave na posição correta
            operationCounter++;  // Conta a operação de inserção da chave
        }

        return operationCounter;
    }

    static public int selectionSort (int [] list) {

        int operationCounter = 0; // Contador de operações..

        // Iterador externo.
        /* Alcança o penultimo elemento da array pois ele será alcançado no loop interno. */
        for (int i = 0; i < list.length - 1; i++) {

            int minIndex = i;

            // Iterador interno
            /* (j = i + 1) Sempre estará um elemento à frente do índice de "i" */
            for (int j = i + 1; j < list.length; j++){

                operationCounter++;

                // Compara os indices vizinhos n1 (iterador externo) e n2 (iterador interno)
                if (list[j] < list[minIndex]) {
                    minIndex = j; // minIndex terá o indice com menor elemento
                }
            }

            /* Se minIndex for diferente de i, significa que o elemento atual (list[i])
            não é o menor da parte não ordenada e precisa ser trocado com list[minIndex],
            que contém o menor valor encontrado nesta iteração. */
            if (minIndex != i) {

                operationCounter++;

                int temp = list[i]; // Armazena temporariamente o elemento na posição i

                // Realiza troca
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }

        return operationCounter;
    }
}