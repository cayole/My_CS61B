
import java.util.function.IntPredicate;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VarianceTest {

    @Test
    public void testAverage() {
        double[] input = {0, 1, 2};
        double actual = Variance.average(input);
        double expected = 1.0;
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void testAverageZero() {
        double[] input = {0};
        double actual = Variance.average(input);
        double expected = 0;
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void testAverageEmoty() {
        double[] input = {};
        double actual = Variance.average(input);
        double expected = 0;
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void testAverageRepeated() {
        double[] input = {5, 5, 5, 5, 5, 5, 5, 5, 23};
        double actual = Variance.average(input);
        double expected = 7;
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void testAverageNotIntegers() {
        double[] input = {5, 5, 5, 5, 5, 5, 5, 24};
        double actual = Variance.average(input);
        double expected = 7.375;
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void testAverageInputNotIntegers() {
        double[] input = {5.5, 6.5};
        double actual = Variance.average(input);
        double expected = 6;
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void testVariance() {
        double[] input = {10, 20, 30, 40};
        double actual = Variance.variance(input);
        double expected = 125.0;
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void testEmptyList() {
        double[] input = {};
        double expected = 0.0;
        double actual = Variance.variance(input);
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void testRepeatedNumbers() {
        double[] input = {61, 61, 61, 61, 61};
        double expected = 0.0;
        double actual = Variance.variance(input);
        assertEquals(expected, actual, 1e-10);
    }

    @Test
    public void testNegative() {
        double[] input = {-1, -2, -3, -8};
        double expected = 7.25;
        double actual = Variance.variance(input);
        assertEquals(expected, actual, 1e-10);
    }
}
