import enums.*;
import instruments.Trumpet;
import instruments.parts.Mouthpiece;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;
    Mouthpiece mouthpiece;
    Material material;
    @Before
    public void before(){

        mouthpiece = new Mouthpiece(Description.MOUTHPIECE,50.0,75.0,2,MouthpieceType.ROUND);
        trumpet = new Trumpet(Description.TRUMPET,500.0,750.0,
                InstrumentType.WOODWIND,TrumpetType.Bb_TRUMPET, Material.METAL,Color.GOLD,BellType.FLAT,
                mouthpiece, Valve.PISTON);
    }
    @Test
    public void hasDescription(){
        assertEquals(Description.TRUMPET, trumpet.trumpetDescription());
    }
    @Test
    public void hasPriceBuy(){
        assertEquals(500.0, trumpet.getTrumpetPriceBuy(),0);
    }
    @Test
    public void hasPriceSell(){
        assertEquals(750.0, trumpet.getTrumpetPriceSell(),0);
    }
    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, trumpet.getTypeOfInstrument());
    }
    @Test
    public void hasType(){
        assertEquals(TrumpetType.Bb_TRUMPET, trumpet.getTrumpetType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.METAL, trumpet.getMaterial());
    }
    @Test
    public void hasColor(){
        assertEquals(Color.GOLD, trumpet.getColor());
    }
    @Test
    public void hasTypeBell(){
        assertEquals(BellType.FLAT, trumpet.getBellType());
    }
    @Test
    public void hasMouthpiece(){
        assertEquals(MouthpieceType.ROUND, trumpet.getMouthpiece().getMouthpieceType());
    }
    @Test
    public void hasValve(){
        assertEquals(Valve.PISTON, trumpet.getValve());
    }




}
