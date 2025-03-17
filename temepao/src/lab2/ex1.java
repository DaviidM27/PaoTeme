package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduceti un numar intre 0 si 5: ");
            n = scanner.nextInt();
        } while (n < 0 || n > 5);
        
        int[] numbers = new int[n];
        System.out.println("Introduceti " + n + " numere:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        reverseArray(numbers);
        
        System.out.println("Tabloul inversat: " + Arrays.toString(numbers));
        scanner.close();
    }
    
    private static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
