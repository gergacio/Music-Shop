import enums.StringType;
import instruments.parts.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {
    GuitarString guitarString;
    @Before
    public void before(){
        guitarString = new GuitarString(StringType.WINDING, 6);
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
