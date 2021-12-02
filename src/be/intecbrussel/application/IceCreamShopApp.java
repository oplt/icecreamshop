package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;


public class IceCreamShopApp {

    public static void main(String[] args) throws NoMoreIceCreamException {


        PriceList priceList = new PriceList(1.25, 1.75, 3);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList, 0);


        Eatable[] order1 = new Eatable[]{
                iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA, Cone.Flavor.STRACIATELLA, Cone.Flavor.BANANA}),
                iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.VANILLA}),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS),
                iceCreamSalon.orderIceRocket()
        };


        for (int i = 0; i < order1.length; i++) {
            order1[i].eat();
        }

        System.out.println("Total profit of the ice cream seller: " + iceCreamSalon.getProfit() + "€");


    }
}
