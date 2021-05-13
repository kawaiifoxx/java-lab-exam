package labExam;

import java.util.function.BiFunction;

/**
 * This is a generic calculator interface.
 * @param <T> type of value on which operation will be performed.
 */
public interface ICalculator<T> {
    T calculate(T a, T b, BiFunction<T,T,T> fx);
}
