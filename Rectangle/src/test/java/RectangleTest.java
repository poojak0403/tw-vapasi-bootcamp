import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {
    @Test
    void shouldReturnAreaOfRectangle() {

        Rectangle rectangle = new Rectangle(20, 10);

        int area = rectangle.findArea();

        assertEquals(200, area);
    }
}
