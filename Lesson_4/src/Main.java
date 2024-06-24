public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "X", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println("1. Valid Array Sum: " + ArrayProcessor.processArray(validArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("1. " + e.getMessage());
        }

        try {
            System.out.println("2. Invalid Size Array Sum: " + ArrayProcessor.processArray(invalidSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("2. " + e.getMessage());
        }

        try {
            System.out.println("3. Invalid Data Array Sum: " + ArrayProcessor.processArray(invalidDataArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("3. " + e.getMessage());
        }
    }
}
