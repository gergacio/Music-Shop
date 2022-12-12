import enums.Description;
import enums.SoundType;
import instruments.parts.UpperJoint;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpperJointTest {
    UpperJoint upperJoint;
    @Before
    public void before(){
        upperJoint = new UpperJoint(Description.UPPER_JOINT,50.0,75.0,
                4,4, SoundType.UPPER_REGISTER);
    }
    @Test
    public void hasDescription(){
        assertEquals(Description.UPPER_JOINT, upperJoint.getDescription());
    }
    @Test
    public void hasCalculateMarkup(){
        assertEquals(0.5, upperJoint.calculateMarkup(),0);
    }
    @Test
    public void hasKeyNumber(){
        assertEquals(4, upperJoint.getKeys());
    }
    @Test
    public void hasKeyTonHoles(){
        assertEquals(4, upperJoint.getTonHoles());
    }
    @Test
    public void hasSoundType(){
        assertEquals(SoundType.UPPER_REGISTER, upperJoint.getSound());
    }
}
