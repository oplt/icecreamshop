package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {


    private PriceList priceList;
    private Stock stock;
    private double profit;


    public IceCreamCar(PriceList priceList, Stock stock, double profit) {
        this.priceList = priceList;
        this.stock = stock;
        this.profit = profit;
    }


    @Override
    public Cone orderCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {
        prepareCone(flavors);
        return new Cone(flavors);
    }

    private Cone prepareCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {
        if (stock.getCones() < 1) {
            throw new NoMoreIceCreamException("No more Cone!");
        } else if (stock.getBalls() < flavors.length) {
            throw new NoMoreIceCreamException("No more Ball!");
        } else {
            profit += priceList.getBallPrice() * flavors.length;
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavors.length);
        }
        return new Cone(flavors);
    }


    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        prepareIceRocket();
        return new IceRocket();
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        if (stock.getIceRocket() < 1) {
            throw new NoMoreIceCreamException("No more Ice Rocket");
        } else {
            stock.setIceRocket(stock.getIceRocket() - 1);
            profit += priceList.getRocketPrice();
        }
        return new IceRocket();
    }


    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {
        prepareMagnum(type);
        return new Magnum(type);
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {
        if (stock.getMagni() < 1) {
            throw new NoMoreIceCreamException("No more Magnum!");
        } else {
            profit += priceList.getMagnumStandardPrice();
            stock.setMagni(stock.getMagni() - 1);
        }
        return new Magnum(type);
    }


    @Override
    public double getProfit() {

        return profit;
    }



}
