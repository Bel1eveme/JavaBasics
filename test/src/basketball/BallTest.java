package basketball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void givenNegativeWeight_WhenAssigned_ThenIllegalArgumentExceptionThrown() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Ball(0, Color.RED));

        assertEquals("Weight must be more than zero.", exception.getMessage());
    }
}