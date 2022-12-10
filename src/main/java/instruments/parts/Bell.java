package instruments.parts;

import enums.BellType;
import enums.StringType;

public class Bell {
    private BellType bellType;
    public Bell(BellType bellType){
        this.bellType = bellType;
    }
    public BellType getBellType(){
        return this.bellType;
    }
}
