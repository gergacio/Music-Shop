import enums.BellType;
import enums.Description;
import instruments.parts.Bell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BellTest {
    Bell bell;
    @Before
    public void before(){
        bell = new Bell(Description.BELL,50.0,75.0,BellType.FLAT);
    }
    @Test
    public void hasDescription(){
        assertEquals(Description.BELL, bell.getDescription());
    }
    @Test
    public void hasCalculateMarkup(){
        assertEquals(0.5, bell.calculateMarkup(),0);
    }
    @Test
    public void hasBellType(){
        assertEquals(BellType.FLAT, bell.getBellType());
    }
}
