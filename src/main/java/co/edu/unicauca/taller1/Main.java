package co.edu.unicauca.taller1;

import java.util.List;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IFigure fig1 = new Circle(1.0); // radio
        IFigure fig2 = new Circle(2.3); // lado
        IFigure fig3 = new Circle(4.2); // base y altura
        List<IFigure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        for (IFigure fig : figures) {
            // System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.calculatePerimeter());
        }

    }
}