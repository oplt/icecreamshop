package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {


    private Flavor[] balls;


    public Cone(Flavor[] balls) {
        this.balls = balls;
    }


    @Override
    public void eat() {
        System.out.println("The client eats a " + toString());
    }

    @Override
    public String toString() {
        return "Cone " + Arrays.toString(balls);
    }


    public enum Flavor {

        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;

    }
}