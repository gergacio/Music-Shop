package instruments;

import enums.*;
import instruments.parts.Mouthpiece;
import shop.Product;

public class Trumpet extends Instrument {

    private TrumpetType trumpetType;
    private BellType bellType;
    private Mouthpiece mouthpiece;
    private Valve valve;
    public Trumpet(Description description, Double priceBuy, Double priceSell,InstrumentType instrumentType,
                   TrumpetType trumpetType,Material material,Color color, BellType bellType, Mouthpiece mouthpiece, Valve valve) {
        super(description, priceBuy, priceSell, instrumentType, material,color);
        this.trumpetType = trumpetType;
        this.bellType = bellType;
        this.mouthpiece = mouthpiece;
        this.valve = valve;
    }
    public Description trumpetDescription(){
        return this.getDescription();
    }
    public Double getTrumpetPriceBuy(){
        return this.getPriceBuy();
    }
    public Double getTrumpetPriceSell(){
        return this.getPriceSell();
    }
    public InstrumentType getTypeOfInstrument(){
        return this.getInstrumentType();
    }
    public TrumpetType getTrumpetType(){
        return this.trumpetType;
    }
    public BellType getBellType(){
        return this.bellType;
    }
    public Mouthpiece getMouthpiece(){
        return this.mouthpiece;
    }
    public Valve getValve(){
        return this.valve;
    }
    //implement play method comming from interface IPLay
    @Override
    public String play(){
        return "Trumpet play";
    }
}
