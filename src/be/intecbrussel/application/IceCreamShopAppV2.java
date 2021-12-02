package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamShopAppV2 {

    public static void main(String[] args) {

        PriceList priceList = new PriceList(2, 2.5, 3);
        Stock stock = new Stock(5, 3, 7, 4);

        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock, 0);


        try {

            Eatable[] order2 = new Eatable[]{
                    iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA, Cone.Flavor.STRACIATELLA, Cone.Flavor.BANANA}),
                    iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.VANILLA}),
                    iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                    iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS),
                    iceCreamCar.orderIceRocket(),
                    iceCreamCar.orderIceRocket(),

            };


            for (Eatable eatable : order2) {
                eatable.eat();
            }

            System.out.println("Ice cream Car profit : " + iceCreamCar.getProfit() + "€");
            System.out.println("The Stock: " + stock);


        } catch (NoMoreIceCreamException outOfStock) {
            System.out.println("This is is out of stock, sorry");
            outOfStock.printStackTrace();
        }


    }
}