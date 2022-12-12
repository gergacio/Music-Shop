package instruments;

import enums.*;
import instruments.parts.GuitarString;

public class Guitar extends Instrument{
    private GuitarString guitarString;
    private GuitarBodyType guitarBodyType;
    private FretboardType fretboardType;

    public Guitar(Description description, Double priceBuy, Double priceSell,InstrumentType instrumentType, Material material, Color color,
                      GuitarString guitarString, GuitarBodyType guitarBodyType, FretboardType fretboardType){
        //invoke parent constructor
        super(description, priceBuy, priceSell,instrumentType, material, color);
        this.guitarString = guitarString;
        this.guitarBodyType = guitarBodyType;
        this.fretboardType = fretboardType;
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
    public void setMaterial(Material material){
        super.setMaterial(material);
    }
    public Color getColor(){
        return super.getColor();
    }
    public void seColor(Color color){
        super.setColor(color);
    }
    public GuitarString getGuitarString(){
        return this.guitarString;
    }
    public GuitarBodyType getGuitarBodyType(){
        return this.guitarBodyType;
    }
    public void setGuitarBodyType(GuitarBodyType guitarBodyType){
        this.guitarBodyType = guitarBodyType;
    }
    public FretboardType getFretboardType(){
        return this.fretboardType;
    }
    public void setFretboardType(FretboardType fretboardType){
        this.fretboardType = fretboardType;
    }

    public String play(){
        return "Guitar play";
    }
    
}
