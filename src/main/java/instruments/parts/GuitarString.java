package instruments.parts;

import enums.StringType;

public class GuitarString {
    private StringType stringType;
    private int stringCount;
    public GuitarString(StringType stringType, int stringCount){
        this.stringType = stringType;
        this.stringCount = stringCount;
    }
    //getters and setters
    public StringType getStringType(){
        return this.stringType;
    }
    public int getStringCount(){
        return this.stringCount;
    }
}
