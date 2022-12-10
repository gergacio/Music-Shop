package instruments;

import enums.Color;
import enums.InstrumentType;
import enums.Material;

public abstract class Instrument {
    private InstrumentType instrumentType;
    private Material material;
    private Color color;
    public Instrument(InstrumentType instrumentType, Material material, Color color){
        this.instrumentType = instrumentType;
        this.material = material;
        this.color = color;
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
}
