package ru.caf82;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Veronika on 13.10.17.
 */

public class RectangleMethodTest {
    @Test
    public void test1() {
        double exactAnswer = 76.30083269361395;
        double res = NumericalIntegration.rectangleMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {
                        return Math.pow(x, 2) * Math.sin(x);
                    }
                },
                4, 9, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }
    @Test
    public void test2() {
        double exactAnswer = 2343.75;
        double res = NumericalIntegration.parabolaMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {return Math.pow(x, 3);}
                },
                5, 10, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }
    @Test
    public void test3() {
        double exactAnswer = 2;
        double res = NumericalIntegration.parabolaMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {
                        return Math.sin(x);
                    }
                },
                0, 3.14, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }

    @Test
    public void test4() {
        double exactAnswer = 0.00159;
        double res = NumericalIntegration.parabolaMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {
                        return Math.cos(x);
                    }
                },
                0, 3.14, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }

    @Test
    public void test5() {
        double exactAnswer = -1.995;
        double res = NumericalIntegration.parabolaMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {
                        return Math.cos(x)*x;
                    }
                },
                0, 3.14, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }

    @Test
    public void test6() {
        double exactAnswer = 3.14159;
        double res = NumericalIntegration.parabolaMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {
                        return Math.sin(x)*x;
                    }
                },
                0, 3.14, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }


    @Test
    public void test7() {
        double exactAnswer = 1.5708;
        double res = NumericalIntegration.parabolaMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {
                        return Math.pow(Math.sin(x), 2);
                    }
                },
                0, 3.14, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }

    @Test
    public void test8() {
        double exactAnswer = 0.7854;
        double res = NumericalIntegration.parabolaMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {
                        return Math.pow(Math.sin(2*x), 2);
                    }
                },
                0, 1.57, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }

    @Test
    public void test9() {
        double exactAnswer = 6.28318;
        double res = NumericalIntegration.parabolaMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {
                        return (Math.pow(Math.sin(x), 2) + 4*Math.pow(Math.sin(x), 4));
                    }
                },
                0, 3.14, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }

    @Test
    public void test10() {
        double exactAnswer = 9.42318;
        double res = NumericalIntegration.parabolaMethod(
                new MathFunction() {
                    @Override
                    public double f(double x) {
                        return (Math.pow(Math.sin(x), 2) + 4*Math.pow(Math.sin(x), 4) + 1);
                    }
                },
                0, 3.14, (int) Math.pow(10, 7));
        System.out.println(res);
        Assert.assertTrue(Math.abs(res - exactAnswer) <=
                Math.pow(10, -5));
    }

}
