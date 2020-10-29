package ru.ssau.tk._KEPA_._practice_.functions.factory;

import ru.ssau.tk._KEPA_._practice_.functions.MathFunction;
import ru.ssau.tk._KEPA_._practice_.functions.ArrayTabulatedFunction;
import ru.ssau.tk._KEPA_._practice_.functions.TabulatedFunction;

public class ArrayTabulatedFunctionFactory implements TabulatedFunctionFactory {
    @Override
    public TabulatedFunction create(double[] xValues, double[] yValues) {
        return new ArrayTabulatedFunction(xValues, yValues);
    }

    @Override
    public TabulatedFunction create(MathFunction source, double xFrom, double xTo, int count) {
        return new ArrayTabulatedFunction(source, xFrom, xTo, count);
    }
}
