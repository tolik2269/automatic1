import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calcCashbackTest(){
        CashbackHackService service=new CashbackHackService();
        int amaunt=800;
        int actual = service.remain(amaunt);
        int expected= 200;
        assertEquals(expected,actual);
    }

    @Test
    public void calcCashbackTestEquality(){
        CashbackHackService service=new CashbackHackService();
        int amaunt=1000;
        int actual = service.remain(amaunt);
        int expected= 0;
        assertEquals(expected,actual);
    }
}
