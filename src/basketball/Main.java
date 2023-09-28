package basketball;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.Put(new Ball(1.5, Color.BLUE));
        basket.Put(new Ball(3.5, Color.BLUE));
        basket.Put(new Ball(6.5, Color.BLUE));
        basket.Put(new Ball(1.5, Color.RED));

        System.out.println("Weight of basket is " + basket.getWeight() +
                ". Count of blue balls is " + basket.getCountByColor(Color.BLUE) + ".");
    }
}
