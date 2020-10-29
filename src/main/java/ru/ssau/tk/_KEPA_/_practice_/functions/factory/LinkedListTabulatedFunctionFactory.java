package ru.ssau.tk._KEPA_._practice_.functions.factory;

import ru.ssau.tk._KEPA_._practice_.functions.MathFunction;
import ru.ssau.tk._KEPA_._practice_.functions.LinkedListTabulatedFunction;
import ru.ssau.tk._KEPA_._practice_.functions.TabulatedFunction;

public class LinkedListTabulatedFunctionFactory implements TabulatedFunctionFactory {
    @Override
    public TabulatedFunction create(double[] xValues, double[] yValues) {
        return new LinkedListTabulatedFunction(xValues, yValues);
    }

    @Override
    public TabulatedFunction create(MathFunction source, double xFrom, double xTo, int count) {
        return new LinkedListTabulatedFunction(source, xFrom, xTo, count);
    }
}
