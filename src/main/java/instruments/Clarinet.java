package instruments;

import enums.Color;
import enums.Description;
import enums.InstrumentType;
import enums.Material;
import instruments.parts.*;

public class Clarinet extends Instrument{
    private Mouthpiece mouthpiece;
    private UpperJoint upperJoint;
    private LowerJoint lowerJoint;
    private Barrel barrel;
    private Bell bell;
    public Clarinet(Description description, Double priceBuy, Double priceSell, InstrumentType instrumentType,
                    Material material, Color color, Mouthpiece mouthpiece,
                    UpperJoint upperJoint, LowerJoint lowerJoint, Barrel barrel, Bell bell) {
        super(description,priceBuy,priceSell,instrumentType, material, color);
        this.mouthpiece = mouthpiece;
        this.upperJoint = upperJoint;
        this.lowerJoint = lowerJoint;
        this.barrel = barrel;
        this.bell = bell;
    }
    //getters and setters
    public InstrumentType getInstrumentType(){
        return super.getInstrumentType();
    }
    public void setInstrumentType(InstrumentType instrumentType){
        super.setInstrumentType(instrumentType);
    }
    public Material getMaterial(){
        return super.getMaterial();
    }

    @Override
    public String play() {
        return "Clarinet play";
    }

    public Mouthpiece getMouthpiece(){
        return this.mouthpiece;
    }
    public LowerJoint getLowerJoint(){
        return this.lowerJoint;
    }
    public UpperJoint getUpperJoint(){
        return this.upperJoint;
    }
    public Barrel getBarrel(){
        return this.barrel;
    }
    public Bell getBell(){
        return this.bell;
    }
}
