package sonar;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithZero()
    {
        Assert.assertEquals("zero",A.dummy(0));
    }

    @Test
    public void shouldAnswerWithNotZero(){
        Assert.assertEquals("not zero",A.dummy(1));
    }
}
