import enums.BarrelType;
import instruments.parts.Barrel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarrelTest {
    Barrel barrel;
    @Before
    public void before(){
        barrel = new Barrel(BarrelType.CYLINDRICAL);
    }
    @Test
    public void hasBarrelType(){
        assertEquals(BarrelType.CYLINDRICAL, barrel.getBarrelType());
    }
    @Test
    public void hasBarrelTypeSetUp(){
        barrel.setBarrelType(BarrelType.TAPERED);
        assertEquals(BarrelType.TAPERED, barrel.getBarrelType());
    }
}
