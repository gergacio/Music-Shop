package instruments.parts;

import enums.BellType;
import enums.Description;
import enums.StringType;
import shop.Product;

public class Bell extends Product {
    private BellType bellType;
    public Bell(Description description, Double priceBuy, Double priceSell, BellType bellType){
        super(description, priceBuy, priceSell);
        this.bellType = bellType;
    }
    public BellType getBellType(){
        return this.bellType;
    }
}
