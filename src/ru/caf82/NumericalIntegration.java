package ru.caf82;

/**
 * Created by Veronika on 13.10.17.
 */
public class NumericalIntegration {
    public static double rectangleMethod(MathFunction mathFunction,
                                         double a, double b, int n) {
        double h = (b - a) / n, sum = 0;
        for (double x = a + 0.5 * h; x <= b; x += h) {
            sum += mathFunction.f(x);
        }
        return h * sum;
    }

    public static double trapezeMethod(MathFunction mathFunction,
                                       double a, double b, int n) {
        double h = (b - a) / n, sum = 0;
        for (double x = a + h; x <= b + h; x += h) {
            sum += mathFunction.f(x);
        }
        return h * (sum - 0.5 * (mathFunction.f(a) + mathFunction.f(b)));
    }

    public static double parabolaMethod(MathFunction mathFunction,
                                        double a, double b, int n) {
        double h = (b - a) / n, sum = 0;
        for (double x = a; x <= b - 2 * h; x += 2 * h) {
            sum += 2 * mathFunction.f(x + 2 * h) +
                    4 * mathFunction.f(x + h);
        }
        return h / 3 * (sum + mathFunction.f(a) - mathFunction.f(b));
    }
}
