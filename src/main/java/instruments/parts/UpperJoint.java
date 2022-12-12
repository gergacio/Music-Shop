package instruments.parts;

import enums.Description;
import enums.SoundType;
import shop.Product;

public class UpperJoint extends Product {
    private int keys;
    private int tonHoles;
    private SoundType sound;
    public UpperJoint(Description description, Double priceBuy, Double priceSell,
                      int keys, int tonHoles, SoundType sound){
        super(description, priceBuy, priceSell);
        this.keys = keys;
        this.tonHoles = tonHoles;
        this.sound = sound;
    }
    //getters
    public int getKeys(){
        return this.keys;
    }
    public int getTonHoles(){
        return this.tonHoles;
    }
    public SoundType getSound(){
        return this.sound;
    }

}
