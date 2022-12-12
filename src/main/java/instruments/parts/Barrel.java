package instruments.parts;

import behavior.ISell;
import enums.BarrelType;
import enums.Description;
import shop.Product;

public class Barrel extends Product {

    private BarrelType barrelType;

    public Barrel(Description description, Double priceBuy, Double priceSell, BarrelType barrelType) {
        super(description, priceBuy, priceSell);
        this.barrelType = barrelType;
    }

    public BarrelType getBarrelType(){
        return this.barrelType;
    }
    public void setBarrelType(BarrelType barrelType){
        this.barrelType = barrelType;
    }

}
