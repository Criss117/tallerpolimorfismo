package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class CircleTest {
    private Circle circle;

    @BeforeEach
    public void init() {
        this.circle = new Circle(2.0);
    }

    @Test
    void testCreate() {
        assertEquals(2.0, this.circle.getRadius());
    }

    @Test
    void testCalculate() {
        assertEquals(2.0 * Math.PI * 2.0, this.circle.calculatePerimeter());
    }

}