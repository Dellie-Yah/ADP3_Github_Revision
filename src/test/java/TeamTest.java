import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Delron Chad Claassen
 * @studentNumber 219360561
 */
public class TeamTest {

    public TeamTest() {
    }
    private Team team1;
    private Team team2;
    private Team team3;

    @BeforeEach
    public void setUp() {
        team1 = new Team();
        team2 = new Team();
        team3 = team1;
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testEquality() {
        assertEquals(team1,team3);
    }

    @Test
    public void testIdentity(){
        assertNotSame(team1,team2);
    }

    @Test
    public void testFail(){
        assertEquals(team1,team3);
        fail("This test will intentionally fail");
    }

    @Test
    public void testWithTimeout() throws InterruptedException{
        Thread.sleep(5000);
    }

    @Disabled("This test is disabled at the moment")
    @Test
    public void testDisability(){
        assertEquals(team1,team3);
    }

}