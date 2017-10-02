package ru.caf82;

/**
 * Created by Вероника on 02.10.2017.
 */
public class Function10  implements MathFunction {

    @Override
    public double f(double x) {return (Math.pow(x, 2) + Math.pow(Math.cos(x), 2));}
}
