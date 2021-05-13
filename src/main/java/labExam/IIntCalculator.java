package labExam;

import java.util.function.BiFunction;

/**
 * Interface for simple {@link Integer} calculation.
 */
public interface IIntCalculator extends ICalculator<Integer> {
    /**
     * Performs provided fx on params a,b. a and b are passed as <code>fx.apply(a,b)</code>
     *
     * @param a First parameter.
     * @param b Second parameter.
     * @param fx Operation to be applied on a and b.
     * @return Result of Operation applied.
     */
    @Override
    default Integer calculate(Integer a, Integer b, BiFunction<Integer, Integer, Integer> fx) {
        return fx.apply(a, b);
    }
}
