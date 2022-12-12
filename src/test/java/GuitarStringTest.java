import enums.Description;
import enums.StringType;
import instruments.parts.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {
    GuitarString guitarString;
    @Before
    public void before(){
        guitarString = new GuitarString(Description.GUITAR_STRING,
                5.0,7.5,StringType.WINDING, 6);
    }
    @Test
    public void hasDescription(){
        assertEquals(Description.GUITAR_STRING, guitarString.getDescription());
    }
    @Test
    public void hasCalculateMarkup(){
        assertEquals(0.5, guitarString.calculateMarkup(),0);
    }
    @Test
    public void hasStringType(){
        assertEquals(StringType.WINDING, guitarString.getStringType());
    }
    @Test
    public void hasStringCount(){
        assertEquals(6, guitarString.getStringCount());
    }
}
