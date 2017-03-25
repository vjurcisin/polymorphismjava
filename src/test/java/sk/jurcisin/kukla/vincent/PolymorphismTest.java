package sk.jurcisin.kukla.vincent;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vincent on 3/25/17.
 */
public class PolymorphismTest {

    @Test
    public void polymorphicMethod_test() throws Exception {
        Base s = new Derived();
        Assert.assertEquals(1, s.getId());
    }

    @Test
    public void nonPolymorphicAttributes_test() throws Exception {
        Base s = new Derived();
        Assert.assertEquals(0, s.id);
    }
}
