package lab2;

import java.util.Arrays;

public class ex2{
    
    public static void sortArray(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length, n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];
        
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }
        
        while (i < n1) {
            mergedArray[k++] = array1[i++];
        }
        
        while (j < n2) {
            mergedArray[k++] = array2[j++];
        }
        
        return mergedArray;
    }
    
    public static void main(String[] args) {
        int[] array1 = {1, 7, 4, 3, 9, 1};
        int[] array2 = {6, 4, 2, 8};
        
        System.out.println("Array1 initial: " + Arrays.toString(array1));
        sortArray(array1);
        System.out.println("Array1 sortat crescator: " + Arrays.toString(array1));
        
        System.out.println("Array2 initial: " + Arrays.toString(array2));
        sortArray(array2);
        System.out.println("Array2 sortat crescator: " + Arrays.toString(array2));
        
        int[] mergedArray = mergeSortedArrays(array1, array2);
        System.out.println("Output: " + Arrays.toString(mergedArray));
    }
}
