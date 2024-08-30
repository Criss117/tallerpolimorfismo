package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class SquareTest {
    private Square square;

    @BeforeEach
    public void init() {
        this.square = new Square(2.0);
    }

    @Test
    void testCreate() {
        assertEquals(2.0, this.square.getSide());
    }

    @Test
    void testCalculate() {
        assertEquals(4.0, this.square.calculateArea());
    }
}
