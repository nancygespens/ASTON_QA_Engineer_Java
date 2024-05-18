public class Main {
    public static void main(String[] args) {
        System.out.println("1. ");
        printThreeWords();

        System.out.println("\n2. ");
        checkSumSign();

        System.out.println("\n3. ");
        printColor();

        System.out.println("\n4. ");
        compareNumbers();

        System.out.println("\n5. ");
        System.out.println(checkSumInRange(10, 5)); // Пример вызова метода

        System.out.println("\n6. ");
        printPositiveOrNegative(0); // Пример вызова метода

        System.out.println("\n7. ");
        System.out.println(isNegative(-1)); // Пример вызова метода

        System.out.println("\n8. ");
        printStringMultipleTimes("Hello", 5); // Пример вызова метода

        System.out.println("\n9. ");
        System.out.println(isLeapYear(2024)); // Пример вызова метода

        System.out.println("\n10. ");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertBinaryArray(binaryArray);

        System.out.println("\n11. ");
        int[] hundredArray = fillArrayWithNumbers(100);
        for (int num : hundredArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\n12. ");
        int[] sampleArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(sampleArray);
        for (int num : sampleArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\n13. ");
        int size = 5; // Пример размера массива
        int[][] squareArray = fillDiagonalsWithOnes(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n14. ");
        int[] customArray = createArray(10, 8);
        for (int num : customArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void printColor() {
        int value = 50; // Можно задать любое значение

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    // 10
    public static void invertBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 11
    public static int[] fillArrayWithNumbers(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // 12
    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // 13
    public static int[][] fillDiagonalsWithOnes(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }
        return array;
    }

    // 14
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
