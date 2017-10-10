package ru.caf82;

/**
 * Created by Вероника on 01.10.17.
 */
public class Parabola implements MathFunction {
    @Override
    public double f(double x) {
        return Math.pow(x, 2);
    }
}
