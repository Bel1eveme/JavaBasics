package basketball;

import java.util.ArrayList;

public class Basket {

    private final ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void Put(Ball ball){
        balls.add(ball);
    }
    public double getWeight() {
        return balls.stream().mapToDouble(Ball::getWeight).sum();
    }

    public int getCountByColor(Color color) {
        return (int)balls.stream().filter(x -> x.getColor() == color).count();
    }
}
