public class FindHighestElement {
    public static int findHighest(int[] arr) {
        return findHighestHelper(arr, 0, arr[0]);
    }

    private static int findHighestHelper(int[] arr, int index, int highest) {
        if (index == arr.length) {
            return highest; // Base case: when the end of the array is reached, return the highest element
        }

        if (arr[index] > highest) {
            highest = arr[index];
        }

        return findHighestHelper(arr, index + 1, highest);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 7, 5, 1, 8, 3};
        int highestElement = findHighest(arr);
        System.out.println("Highest Element: " + highestElement);
    }
}
