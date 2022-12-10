import enums.*;
import instruments.Guitar;
import instruments.parts.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;
    GuitarString guitarString;
    @Before
    public void before(){
        guitarString = new GuitarString(StringType.WINDING,6);
        guitar = new Guitar(InstrumentType.STRING, Material.WOOD,
                Color.BLACK,guitarString, GuitarBodyType.SOLID_BODY, FretboardType.EBONY);
    }
    @Test
    public void hasStringType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, guitar.getMaterial());
    }
    @Test
    public void hasColor(){
        assertEquals(Color.BLACK, guitar.getColor());
    }
    @Test
    public void hasChangeColor(){
        guitar.seColor(Color.BLUE);
        assertEquals(Color.BLUE, guitar.getColor());
    }
    @Test
    public void hasGuitarString(){
        int stringCount = guitarString.getStringCount();
        assertEquals(6, stringCount);
    }
    @Test
    public void hasGuitarBodyType(){
        assertEquals(GuitarBodyType.SOLID_BODY, guitar.getGuitarBodyType());
    }
    @Test
    public void hasGuitarBodyTypeChanged(){
        guitar.setGuitarBodyType(GuitarBodyType.JUMBO);
        assertEquals(GuitarBodyType.JUMBO, guitar.getGuitarBodyType());
    }
    @Test
    public void hasGuitarFretboardType(){
        assertEquals(FretboardType.EBONY, guitar.getFretboardType());
    }

}
