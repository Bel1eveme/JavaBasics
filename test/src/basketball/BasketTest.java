package basketball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketTest {

    private static Basket basket;

    private static final double PRECISION = 0.0001;

    @BeforeEach
    void setup(){
        basket = new Basket();

        basket.Put(new Ball(0.5, Color.RED));
        basket.Put(new Ball(1.5, Color.BLUE));
        basket.Put(new Ball(3.0, Color.BLUE));
        basket.Put(new Ball(2.0, Color.GREEN));
    }

    @Test
    void givenGoodArguments_WhenWeightCalculated_ThenResultSame() {
        double expected = 7;

        double actual = basket.getWeight();

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void givenGoodArguments_WhenCountCalculated_ThenResultSame() {
        int expected = 2;

        int actual = basket.getCountByColor(Color.BLUE);

        assertEquals(expected, actual);
    }
}