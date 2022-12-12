package instruments.parts;

import enums.Description;
import enums.MouthpieceType;
import shop.Product;

public class Mouthpiece extends Product {
    private int size;
    private MouthpieceType mouthpieceType;
    public Mouthpiece(Description description,Double priceBuy, Double priceSell,
                      int size, MouthpieceType mouthpieceType){
        super(description, priceBuy, priceSell);
        this.size = size;
        this.mouthpieceType = mouthpieceType;

    }
    public int getSize(){
        return this.size;
    }
    public MouthpieceType getMouthpieceType(){
        return this.mouthpieceType;
    }
}
