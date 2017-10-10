package ru.caf82;

/**
 * Created by Вероника on 02.10.2017.
 */
public class Xsintg implements MathFunction {

    @Override
    public double f(double x) {return Math.pow(x, 2) * Math.sin(x) * Math.tan(x); }
}
