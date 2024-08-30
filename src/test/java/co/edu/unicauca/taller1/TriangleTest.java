package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    public void init() {
        this.triangle = new Triangle(2.0, 3.0);
    }

    @Test
    void testCreate() {
        assertEquals(2.0, this.triangle.getBase());
        assertEquals(3.0, this.triangle.getHeight());
    }

    @Test
    void testCalculate() {
        assertEquals(3.0, this.triangle.calculateArea());
        assertEquals(6.0, this.triangle.calculatePerimeter());
    }

}
