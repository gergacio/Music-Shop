import enums.BarrelType;
import enums.Description;
import instruments.parts.Barrel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarrelTest {
    Barrel barrel;
    @Before
    public void before(){
        barrel = new Barrel(Description.BARREL, 50.0, 75.0,BarrelType.CYLINDRICAL);
    }
    @Test
    public void hasDescription(){
        assertEquals(Description.BARREL, barrel.getDescription());
    }
    @Test
    public void hasCalculateMarkup(){
        assertEquals(0.5, barrel.calculateMarkup(),0);
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
