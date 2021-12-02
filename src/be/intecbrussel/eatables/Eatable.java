package be.intecbrussel.eatables;

import be.intecbrussel.sellers.NoMoreIceCreamException;

public interface Eatable {

    void eat() throws NoMoreIceCreamException;
}