import java.util.Arrays;

public class Main {
    public static final int maxRandomValue = 100;
    public static final int ARRAY_HEIGHT = 4;

    public static void main(String[] args) {
        int[] array = new int[20];
        random(array);
        minOfArray(array);
        maxOfArray(array);
        sortDescending(array);
        sortAscending(array);
        printSumOfValues(array);
        exponentiationOfValuesToSquare(array);
        printDiagonalValues();
        setSameValuesToZero();
    }

    public static void sortDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int bubble = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = bubble;
                }
            }
        }
        System.out.println("Sort of descending: " + Arrays.toString(array));
    }

    public static void sortAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int bubble = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = bubble;
                }
            }
        }
        System.out.println("Sort of ascending: " + Arrays.toString(array));
    }

    private static void maxOfArray(int[] myArray) {
        int max = myArray[0];
        for (int i : myArray) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Max of array is: " + max);
    }

    private static void minOfArray(int[] myArray) {
        int min = myArray[0];
        for (int i : myArray) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Min of array is: " + min);
    }

    private static void random(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * (maxRandomValue));
        }
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }

    private static void printSumOfValues(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum = sum + value;
        }
        System.out.println("\n" + "Sum of all the numbers in my array: " + sum);
    }

    private static void exponentiationOfValuesToSquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2);
        }
        System.out.println("Array after exponentiation all elements to the square: " + Arrays.toString(array));
    }

    private static void printDiagonalValues() {
        System.out.print("\n" + "The value of the array on the main diagonal: ");
        String[][] matrixArray =
                {{"mr", "mq", "ly", "ad"},
                        {"le", "lt", "dr", "fd"},
                        {"cb", "cc", "ff", "er"},
                        {"ad", "dy", "mv", "me"}};
        for (int i = 0; i < ARRAY_HEIGHT; i++) {
            for (int j = 0; j < ARRAY_HEIGHT; j++) {
                if (matrixArray[i][j].equals(matrixArray[j][i])) {
                    System.out.print(matrixArray[i][j] + " ");
                }
            }
        }
    }

    private static void setSameValuesToZero() {
        int[] secondArray = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = i + 1; j < secondArray.length; j++) {
                if (secondArray[i] == secondArray[j]) {
                    if (secondArray[i] != 0) {
                        secondArray[j] = 0;
                    }
                }
            }
        }
        System.out.println("\n" + "Array after reduction of the same values to zero  " + Arrays.toString(secondArray));
    }
}
