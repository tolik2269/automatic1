
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calcCashbackTest(){
        CashbackHackService service=new CashbackHackService();
        int amaunt=900;
        int actual = service.remain(amaunt);
        int expected= 100;
        assertEquals(actual,expected);
    }

    @Test
    public void calcCashbackTestEquality(){
        CashbackHackService service=new CashbackHackService();
        int amaunt=1000;
        int actual = service.remain(amaunt);
        int expected= 0;
        assertEquals(actual,expected);
    }
}
