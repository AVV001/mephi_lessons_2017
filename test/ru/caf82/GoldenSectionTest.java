package ru.caf82;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Вероника on 01.10.17.
 */
public class GoldenSectionTest {
    @Test
    public void test1() {
        MathFunction parabola = new Parabola();

        double eps = Math.pow(10, -5);
        double res = SymmetricMethods.goldenSection(
                parabola, -6.38, 45.91, eps
        );

        System.out.println(res);

        Assert.assertTrue(Math.abs(res - 0) <= eps);
    }

    @Test
    public void test2() {
        MathFunction sin = new Sin();

        double eps = Math.pow(10, -5);
        double res = SymmetricMethods.goldenSection(
                sin, -3 * Math.PI / 2, Math.PI / 2, eps
        );

        System.out.println(res);

        Assert.assertTrue(Math.abs(res - (- Math.PI / 2)) <= eps);
    }

    @Test
    public void test3() {
        MathFunction cos = new Cos();

        double eps = Math.pow(10, -5);
        double res = SymmetricMethods.goldenSection(
                cos, -2 * Math.PI, 0, eps
        );
        System.out.println(res);

        Assert.assertTrue(Math.abs(res - (- Math.PI)) <= eps);

    }

    @Test
    public void test4() {
        MathFunction xsinx = new Xsinx();

        double eps = Math.pow(10, -4);
        double res = SymmetricMethods.goldenSection(
                xsinx, 4 , 6, eps
        );
        System.out.println(res);

        Assert.assertTrue(Math.abs(res - 5.087)<= eps);
    }

    @Test
    public void test5() {
        MathFunction xcosx = new Xcosx();

        double eps = Math.pow(10, -4);
        double res = SymmetricMethods.goldenSection(
                xcosx, -2 , 2, eps
        );
        System.out.println(res);

        Assert.assertTrue(Math.abs(res - 0) <= eps);
    }

    @Test
    public void test6() {
        MathFunction xsintg = new Xsintg();

        double eps = Math.pow(10, -4);
        double res = SymmetricMethods.goldenSection(
                xsintg, -2 , 2, eps
        );
        System.out.println(res);

        Assert.assertTrue(Math.abs(res - 0) <= eps);
    }

    @Test
    public void test7() {
        MathFunction parab2 = new Parab2();

        double eps = Math.pow(10, -3);
        double res = SymmetricMethods.goldenSection(
                parab2, -6 , 6, eps
        );
        System.out.println(res);

        Assert.assertTrue(Math.abs(res - (-0.51)) <= eps);
    }

    @Test
    public void test8() {
        MathFunction func8 = new Function8();

        double eps = Math.pow(10, -3);
        double res = SymmetricMethods.goldenSection(
                func8, -1 , 0, eps
        );
        System.out.println(res);

        Assert.assertTrue(Math.abs(res - (-0.63)) <= eps);
    }

    @Test
    public void test9() {
        MathFunction func9 = new Function9();

        double eps = Math.pow(10, -3);
        double res = SymmetricMethods.goldenSection(
                func9, -2 , 1, eps
        );
        System.out.println(res);

        Assert.assertTrue(Math.abs(res - (-0.592)) <= eps);
    }
    @Test
    public void test10() {
        MathFunction func10 = new Function10();

        double eps = Math.pow(10, -3);
        double res = SymmetricMethods.goldenSection(
                func10, -6 , 6, eps
        );
        System.out.println(res);

        Assert.assertTrue(Math.abs(res - 0) <= eps);
    }
}

