import java.util.Arrays;

public class AddTaxToSalary {
    public static double[] addTax(double[] salaries) {
        return addTaxHelper(salaries, 0);
    }

    private static double[] addTaxHelper(double[] salaries, int index) {
        if (index == salaries.length) {
            return new double[0]; // Base case: when the end of the array is reached, return an empty array
        }

        double currentSalary = salaries[index];
        double salaryWithTax = currentSalary + (currentSalary * 0.1);
        double[] updatedSalaries = addTaxHelper(salaries, index + 1);

        double[] result = new double[updatedSalaries.length + 1];
        result[0] = salaryWithTax;
        System.arraycopy(updatedSalaries, 0, result, 1, updatedSalaries.length);

        return result;
    }

    public static void main(String[] args) {
        double[] salaries = {5000.0, 8000.0, 6500.0, 10000.0};
        double[] salariesWithTax = addTax(salaries);
        System.out.println("Salaries with Tax: " + Arrays.toString(salariesWithTax));
    }
}
