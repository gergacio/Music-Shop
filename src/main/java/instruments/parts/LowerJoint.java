package instruments.parts;

import enums.SoundType;

public class LowerJoint {
    private int keys;
    private int tonHoles;
    private SoundType sound;
    public LowerJoint(int keys, int tonHoles, SoundType sound){
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
