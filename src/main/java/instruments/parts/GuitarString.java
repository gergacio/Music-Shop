package instruments.parts;

import enums.Description;
import enums.StringType;
import shop.Product;

public class GuitarString extends Product {
    private StringType stringType;
    private int stringCount;
    public GuitarString(Description description, Double priceBuy, Double priceSell, StringType stringType, int stringCount){
        super(description, priceBuy, priceSell);
        this.stringType = stringType;
        this.stringCount = stringCount;
    }
    //getters and setters
    public StringType getStringType(){
        return this.stringType;
    }
    public int getStringCount(){
        return this.stringCount;
    }
}
