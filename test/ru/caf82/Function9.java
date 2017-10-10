package ru.caf82;

/**
 * Created by Вероника on 02.10.2017.
 */
public class Function9 implements MathFunction {

    @Override
    public double f(double x) {return (Math.pow(x, 4) + Math.sin(x));}
}
