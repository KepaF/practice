package ru.ssau.tk._KEPA_._practice_.functions;

import java.awt.*;

public interface TabulatedFunction extends MathFunction, Iterable<Point> {

    int getCount();

    double getX(int index);

    double getY(int index);

    void setY(int index, double value);

    int indexOfX(double x);

    int indexOfY(double y);

    double leftBound();

    double rightBound();
}