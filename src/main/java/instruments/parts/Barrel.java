package instruments.parts;

import enums.BarrelType;

public class Barrel {
    private BarrelType barrelType;
    public Barrel(BarrelType barrelType){
        this.barrelType = barrelType;
    }
    public BarrelType getBarrelType(){
        return this.barrelType;
    }
    public void setBarrelType(BarrelType barrelType){
        this.barrelType = barrelType;
    }
}
