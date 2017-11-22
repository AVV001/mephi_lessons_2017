package ru.caf82;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Вероника on 17.11.2017.
 */
public class SymplexMethodTest {
    @Test
    public void test1() {
        SymplexMethod.readFromFile("C:\\Users\\Вероника\\Desktop\\4 курс\\лабы\\4\\test1.txt");
        SymplexMethod.symplexMethod();
    }

    @Test
    public void test2() {
        SymplexMethod.readFromFile("C:\\Users\\Вероника\\Desktop\\4 курс\\лабы\\4\\test2.txt");
        SymplexMethod.symplexMethod();
    }

    @Test
    public void test3() {
        SymplexMethod.readFromFile("C:\\Users\\Вероника\\Desktop\\4 курс\\лабы\\4\\test3.txt");
        SymplexMethod.symplexMethod();
    }

    @Test
    public void test4() {
        SymplexMethod.readFromFile("C:\\Users\\Вероника\\Desktop\\4 курс\\лабы\\4\\test4.txt");
        SymplexMethod.symplexMethod();
    }

    @Test
    public void test5() {
        SymplexMethod.readFromFile("C:\\Users\\Вероника\\Desktop\\4 курс\\лабы\\4\\test5.txt");
        SymplexMethod.symplexMethod();
    }
}

