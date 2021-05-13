package labExam;

/**
 * Declares simple operations for an Integer Calculator.
 */
public interface IIntOperationProvider extends ICalculator<Integer> {
    Integer add(Integer a, Integer b);
    Integer subtract(Integer a, Integer b);
    Integer multiply(Integer a, Integer b);
    Integer divide(Integer a, Integer b);
    Integer mod(Integer a, Integer b);
}
