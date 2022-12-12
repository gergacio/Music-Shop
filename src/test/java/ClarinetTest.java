import enums.*;
import instruments.Clarinet;
import instruments.Instrument;
import instruments.parts.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {
    Clarinet clarinet;
    Mouthpiece mouthpiece;
    UpperJoint upperJoint;
    LowerJoint lowerJoint;
    Barrel barrel;
    Bell bell;

    @Before
    public void before(){
        bell = new Bell(Description.BELL, 50.0, 75.0,BellType.FLAT);
        barrel = new Barrel(Description.BARREL,50.0,75.0,BarrelType.CYLINDRICAL);
        lowerJoint = new LowerJoint(Description.LOWER_JOINT,50.0,75.0,3,3,SoundType.LOWER_REGISTER);
        upperJoint = new UpperJoint(Description.UPPER_JOINT,50.0,75.0,3, 3, SoundType.UPPER_REGISTER);
        mouthpiece = new Mouthpiece(Description.MOUTHPIECE,50.0,75.5,2, MouthpieceType.HORSESHOE);
        clarinet = new Clarinet(Description.CLARINET,500.0,750.0,InstrumentType.WOODWIND, Material.WOOD, Color.SILVER,
                mouthpiece, upperJoint, lowerJoint, barrel, bell);
    }
    @Test
    public void hasDescription(){
        assertEquals(Description.CLARINET, clarinet.getDescription());
    }
    @Test
    public void hasPriceBuy(){
        assertEquals(500.0, clarinet.getPriceBuy(),0);
    }
    @Test
    public void hasPriceSell(){
        assertEquals(750.0, clarinet.getPriceSell(),0);
    }
    @Test
    public void hasCalculateMarkup(){
        assertEquals(0.5, clarinet.calculateMarkup(),0);
    }
    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, clarinet.getInstrumentType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, clarinet.getMaterial());
    }
    @Test
    public void hasColor(){
        assertEquals(Color.SILVER, clarinet.getColor());
    }
    @Test
    public void hasMouthpiece(){
        int size = clarinet.getMouthpiece().getSize();
        assertEquals(2, size);
    }
    @Test
    public void hasUpperJoint(){
        int toneHoles = clarinet.getUpperJoint().getTonHoles();
        assertEquals(3, toneHoles);
    }
    @Test
    public void hasLowerJoint(){
        SoundType soundType = clarinet.getLowerJoint().getSound();
        assertEquals(SoundType.LOWER_REGISTER, soundType);
    }
    @Test
    public void hasBarrel(){
        assertEquals(BarrelType.CYLINDRICAL, clarinet.getBarrel().getBarrelType());
    }
    @Test
    public void hasBell(){
        assertEquals(BellType.FLAT, clarinet.getBell().getBellType());
    }
    @Test
    public void hasPlay(){
        assertEquals("Clarinet play", clarinet.play());
    }

}
