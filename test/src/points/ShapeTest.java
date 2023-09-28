package points;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShapeTest {

    private static final AreaVerifier verifier = new AreaVerifier(new ArrayList<>()
    {{
        add(new Shape(5, 0, -4, 4));
        add(new Shape(0, -3, -6, 6));
    }
    });

    @Test
    void givenRequiredCoordinates_WhenCheckedProperly_ThenResultIsTrue() {
        Point point = new Point(3, 4);

        assertTrue(verifier.IsInArea(point));
    }

    @Test
    void givenRequiredBorderCoordinates_WhenCheckedProperly_ThenResultIsTrue() {
        Point point = new Point(-5, -2);

        assertTrue(verifier.IsInArea(point));
    }

    @Test
    void givenOutOfShapeCoordinates_WhenCheckedProperly_ThenResultIsFalse() {
        Point point = new Point(5, 1);

        assertFalse(verifier.IsInArea(point));
    }
}