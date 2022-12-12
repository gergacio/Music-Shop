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
        guitarString = new GuitarString(Description.GUITAR_STRING,5.0, 7.5,StringType.WINDING,6);
        guitar = new Guitar(Description.GUITAR,500.00,750.00,InstrumentType.STRING, Material.WOOD,
                Color.BLACK,guitarString, GuitarBodyType.SOLID_BODY, FretboardType.EBONY);
    }
    @Test
    public void hasDescription(){
        assertEquals(Description.GUITAR, guitar.getDescription());
    }
    @Test
    public void hasPriceBuy(){
        assertEquals(500.0, guitar.getPriceBuy(),0);
    }
    @Test
    public void hasPriceSell(){
        assertEquals(750.0, guitar.getPriceSell(),0);
    }
    @Test
    public void hasCalculateMarkup(){
        assertEquals(0.5, guitar.calculateMarkup(),0);
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
        int stringCount = guitar.getGuitarString().getStringCount();
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
        guitar.setFretboardType(FretboardType.MAPLE);
        assertEquals(FretboardType.MAPLE, guitar.getFretboardType());
    }
    @Test
    public void hasPlay(){
        assertEquals("Guitar play", guitar.play());
    }

}
