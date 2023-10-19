import java.util.Arrays;

public class DZ2 {
    public static void main(String[] args) {
        //task1
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        System.out.println("Количество четных чисел в массиве " + Arrays.toString(array1) + " равно " + countEvens(array1));
        System.out.println("Количество четных чисел в массиве " + Arrays.toString(array2) + " равно " + countEvens(array2));
        System.out.println("Количество четных чисел в массиве " + Arrays.toString(array3) + " равно " + countEvens(array3));
        System.out.println();
        //task2
        System.out.println("Разность максимального и минимального элемента в массиве " + Arrays.toString(array1) +
                " равна " + arrayRange(array1));
        System.out.println();
        //task3
        int[] testArray1 = {1,2,3,0,0,4,5};
        int[] testArray2 = {1,0,1,0,1,0,1};
        System.out.println("В массиве "+Arrays.toString(testArray1)+ " есть 2 соседних 0:"+doubleZeroes(testArray1));
        System.out.println("В массиве "+Arrays.toString(testArray2)+ " есть 2 соседних 0:"+doubleZeroes(testArray2));

    }

    static int countEvens(int[] array) {
        int evensCount = 0;
        for (int number :
                array) {
            if (number % 2 == 0) evensCount++;
        }
        return evensCount;
    }

    static int arrayRange(int[] array) {
        if (array.length == 0) {
            System.out.println("Массив пуст!");
            return -1;
        }
        int min = array[0];
        int max = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] > max) max = array[i];
            else if (array[i] < min) min = array[i];
            i++;
        }
        return max - min;
    }

    static boolean doubleZeroes(int[] array) {
        if (array.length < 2) {
            System.out.println("В массиве меньше двух элементов!");
            return false;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) return true;
        }
        return  false;
    }
}
