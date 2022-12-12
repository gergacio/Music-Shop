package instruments;

import behavior.IPlay;
import enums.Color;
import enums.Description;
import enums.InstrumentType;
import enums.Material;
import shop.Product;
import shop.Shop;

public abstract class Instrument extends Product implements IPlay {
    private InstrumentType instrumentType;
    private Material material;
    private Color color;
    public Instrument(Description description,Double priceBuy, Double priceSell, InstrumentType instrumentType, Material material, Color color){
        super(description, priceBuy, priceSell);
        this.instrumentType = instrumentType;
        this.material = material;
        this.color = color;
    }
    public Description getDescription(){
        return super.getDescription();
    }
    public Double getPriceBuy(){
        return super.getPriceBuy();
    }
    public Double getPriceSell(){
        return super.getPriceSell();
    }
    public InstrumentType getInstrumentType(){
        return instrumentType;
    }
    public void setInstrumentType(InstrumentType instrumentType){
        this.instrumentType = instrumentType;
    }
    public Material getMaterial(){
        return this.material;
    }

    public void setMaterial(Material material){
        this.material = material;
    }
    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public abstract String play();
}
