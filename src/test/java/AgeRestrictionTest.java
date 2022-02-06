
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

public class AgeRestrictionTest
{
    AgeRestriction ageRestriction;
    AgeRestriction ageRestrictionCopy;

    @BeforeEach
    public void setUp()
    {
        ageRestriction = new AgeRestriction(20);
        ageRestrictionCopy = new AgeRestriction(16);
    }

    @Test
    public void objectEqualityTest()
    {
        ageRestrictionCopy = ageRestriction;
        assertEquals(ageRestriction, ageRestrictionCopy);
    }

    @Test
    public void checkObjectIdentity()
    {
        ageRestrictionCopy = ageRestriction;
        assertSame(ageRestriction, ageRestrictionCopy);
    }

    @Test
    public void failingTest()
    {
//        fail("Failed as per requirement");
    }

    @Test
    public void timeoutTest()
    {
        assertTimeout(ofMillis(10), () ->
        {
            Thread.sleep(9);
        });
    }

    @Test
    @Disabled("Disabled as per requirement")
    public void disabledTest()
    {
        try
        {
            ageRestriction.CheckAge();
        } catch (AgeRestrictionException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
