package be.intecbrussel.eatables;

public class Magnum implements Eatable {


    private MagnumType type;


    public Magnum(MagnumType type) {
        this.type = type;
    }


    public MagnumType getType() {
        return type;
    }

    public void setType(MagnumType type) {
        this.type = type;
    }


    @Override
    public void eat() {
        System.out.println("The client eats a " + toString());
    }

    @Override
    public String toString() {
        return "Magnum [" + getType() + "]";
    }


    public enum MagnumType {

        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES;

    }
}