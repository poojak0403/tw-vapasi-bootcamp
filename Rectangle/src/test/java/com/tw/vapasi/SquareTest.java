package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void shouldReturnAreaOfSquareSixteenForSideFour() {
        Square square = new Square(4);

        int area = square.area();

        assertEquals(16, area);
    }

    @Test
    void shouldReturnAreaOfSquareFourForSideTwo() {
        Square square = new Square(2);

        int area = square.area();

        assertEquals(4, area);
    }

    @Test
    void shouldReturnPerimeterOfSquareSixteenForSideFour() {
        Square square = new Square(4);

        int perimeter = square.perimeter();

        assertEquals(16, perimeter);
    }

    @Test
    void shouldReturnPerimeterOfSquareTwentyForSideFive() {
        Square square = new Square(5);

        int perimeter = square.perimeter();

        assertEquals(20, perimeter);
    }
}
