package ru.caf82;

/**
 * Created by Вероника on 01.10.17.
 */
public class SymmetricMethods {
    public static double goldenSection(MathFunction mathFunction, double a, double b,
                                       double eps) {

        double phi = ((1 + Math.sqrt(5)) / 2);

        double x1 = b - (b - a) / phi;
        double x2 = a + (b - a) / phi;

        while ((b - a) / 2 >= eps) {
            if (mathFunction.f(x1) > mathFunction.f(x2)) {
                a = x1;
                x1 = x2;
                x2 = b - (x1 - a);
            } else {
                b = x2;
                x2 = x1;
                x1 = a + (b - x2);
            }
        }

        return (a + b) / 2;
    }

    public static double halfDivide(MathFunction mathFunction, double a, double b,
                                    double delta, double eps) {

        while ((b - a) / 2 >= eps) {
            double x1 = (a + b - delta) / 2;
            double x2 = (a + b + delta) / 2;

            if (mathFunction.f(x1) > mathFunction.f(x2)) {
                a = x1;
            } else {
                b = x2;
            }
        }

        return (a + b) / 2;
    }
}