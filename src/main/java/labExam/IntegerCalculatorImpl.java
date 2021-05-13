package labExam;

public class IntegerCalculatorImpl implements IIntCalculator, IIntOperationProvider {
    @Override
    public Integer add(Integer a, Integer b) {
        return calculate(a, b, Integer::sum);
    }

    @Override
    public Integer subtract(Integer a, Integer b) {
        return calculate(a, b, (x,y) -> x - y);
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return calculate(a,b, (x, y) -> x * y);
    }

    @Override
    public Integer divide(Integer a, Integer b) {
        return calculate(a,b, (x, y) -> x/y);
    }

    @Override
    public Integer mod(Integer a, Integer b) {
        return calculate(a, b, (x,y) -> x % y);
    }
}
