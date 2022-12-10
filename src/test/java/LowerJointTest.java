import enums.SoundType;
import instruments.parts.LowerJoint;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowerJointTest {
    LowerJoint lowerJoint;
    @Before
    public void before(){
        lowerJoint = new LowerJoint(3,3, SoundType.LOWER_REGISTER);
    }
    @Test
    public void hasKeyNumber(){
        assertEquals(3, lowerJoint.getKeys());
    }
    @Test
    public void hasKeyTonHoles(){
        assertEquals(3, lowerJoint.getTonHoles());
    }
    @Test
    public void hasSoundType(){
        assertEquals(SoundType.LOWER_REGISTER, lowerJoint.getSound());
    }
}
