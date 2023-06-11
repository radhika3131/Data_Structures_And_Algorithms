import java.util.List;

public class NumberProduct {
    public static int getProduct(List<Integer> numbers) {
        return getProductHelper(numbers, 0);
    }

    private static int getProductHelper(List<Integer> numbers, int index) {
        if (index == numbers.size()) {
            return 1; // Base case: when the end of the list is reached, return 1
        }

        int currentNumber = numbers.get(index);
        int productOfRemainingList = getProductHelper(numbers, index + 1);
        return currentNumber * productOfRemainingList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5);
        int product = getProduct(numbers);
        System.out.println("Product: " + product);
    }
}

