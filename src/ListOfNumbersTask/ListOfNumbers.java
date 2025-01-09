package ListOfNumbersTask;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Double> numbers;

    public ListOfNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(Double number) {
        numbers.add(number);
    }

    public double getAverage() {
        if (numbers.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{numbers=" + numbers + "}";
    }
}
