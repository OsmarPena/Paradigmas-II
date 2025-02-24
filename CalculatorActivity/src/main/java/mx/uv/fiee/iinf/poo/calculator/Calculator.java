package mx.uv.fiee.iinf.poo.calculator;

public class Calculator <T extends Number> {
    private final T[] numbers;
    public Calculator (T[] numbers) {
        this.numbers = numbers;
    }
    public double average () {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue ();
        }
        return sum / numbers.length;
    }
}
