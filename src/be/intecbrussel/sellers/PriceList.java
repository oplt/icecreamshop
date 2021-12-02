package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

     public PriceList() {
        this.ballPrice = 0.5;
        this.rocketPrice = 1.5;
        this.magnumStandardPrice = 2.25;
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {

         return ballPrice;
    }

    public void setBallPrice(double ballPrice) {

         this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {

         return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {

         this.rocketPrice = rocketPrice;
    }

    public double getMagnumStandardPrice() {

         return magnumStandardPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {

         this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
         switch(type){
            case MILKCHOCOLATE: magnumStandardPrice *= 1.5; break;
            case WHITECHOCOLATE: magnumStandardPrice *= 1.25; break;
            case BLACKCHOCOLATE: magnumStandardPrice *= 1.75; break;
            case ALPINENUTS: magnumStandardPrice *= 2; break;
            case ROMANTICSTRAWBERRIES: magnumStandardPrice *= 2.5; break;

        }
        return magnumStandardPrice;
    }


}
