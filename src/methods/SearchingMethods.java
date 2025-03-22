package methods;

public class SearchingMethods {

    public static int LinearSearch (int target, int[] list) {

        int operationCounter = 0;

        for (int i = 0; i < list.length; i++) {

            operationCounter++;
            if (list[i] == target) {

                return operationCounter;
            }
        }

        return operationCounter;
    }

    public static int binarySearch(int target, int[] list) {
        int operationCounter = 0;

        int left = 0;
        int right = list.length - 1;

        while (left <= right) {
            operationCounter++;

            int middle = (left + right) / 2; // Índice do meio

            if (list[middle] == target) {
                return operationCounter;
            }

            if (target > list[middle]) { // Se o alvo for maior, busca na metade direita
                left = middle + 1;
            }
            else { // Se o alvo for menor, busca na metade esquerda
                right = middle - 1;
            }
        }

        return operationCounter;
    }

}
