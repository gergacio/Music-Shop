import enums.Description;
import enums.MouthpieceType;
import instruments.parts.Mouthpiece;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouthpieceTest {
    Mouthpiece mouthpiece;
    @Before
    public void before(){
        mouthpiece = new Mouthpiece(Description.MOUTHPIECE,50.0,75.0,
                2,MouthpieceType.HORSESHOE);
    }
    @Test
    public void hasDescription(){
        assertEquals(Description.MOUTHPIECE, mouthpiece.getDescription());
    }
    @Test
    public void hasCalculateMarkup(){
        assertEquals(0.5, mouthpiece.calculateMarkup(),0);
    }
    @Test
    public void hasSize(){
        assertEquals(2, mouthpiece.getSize());
    }
    @Test
    public void hasMouthpieceType(){
        assertEquals(MouthpieceType.HORSESHOE, mouthpiece.getMouthpieceType());
    }
}
