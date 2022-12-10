import enums.BellType;
import instruments.parts.Bell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BellTest {
    Bell bell;
    @Before
    public void before(){
        bell = new Bell(BellType.FLAT);
    }
    @Test
    public void hasBellType(){
        assertEquals(BellType.FLAT, bell.getBellType());
    }
}
