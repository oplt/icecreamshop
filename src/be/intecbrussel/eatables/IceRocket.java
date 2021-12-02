package be.intecbrussel.eatables;

public class IceRocket implements Eatable{


    public IceRocket() {

    }


    @Override
    public void eat() {
        System.out.println("The client eats an IceRocket");
    }

    @Override
    public String toString() {
        return "IceRocket";
    }
}
