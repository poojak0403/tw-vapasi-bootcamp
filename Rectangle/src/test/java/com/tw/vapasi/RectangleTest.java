package com.tw.vapasi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void shouldReturnAreaOfRectangleTwentyForLengthFiveAndBreadthFour() {

        Rectangle rectangle = new Rectangle(5, 4);

        int area = rectangle.area();

        assertEquals(20, area);
    }

    @Test
    void shouldReturnAreaOfRectangleTwoHundredForLengthTwentyAndBreadthTen() {

        Rectangle rectangle = new Rectangle(20, 10);

        int area = rectangle.area();

        assertEquals(200, area);
    }

    @Test
    void shouldReturnPerimeterOfRectangleEighteenForLengthFiveAndBreadthFour() {

        Rectangle rectangle = new Rectangle(5, 4);

        int perimeter = rectangle.perimeter();

        assertEquals(18, perimeter);
    }

    @Test
    void shouldReturnPerimeterOfRectangleSixtyForLengthTwentyAndBreadthTen() {

        Rectangle rectangle = new Rectangle(20, 10);

        int perimeter = rectangle.perimeter();

        assertEquals(60, perimeter);
    }


}
