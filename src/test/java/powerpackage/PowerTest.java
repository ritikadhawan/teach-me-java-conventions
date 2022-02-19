package powerpackage;
import org.junit.Test;

public class PowerTest {
    @Test
    public void one_raised_to_one_is_onew() {
        assert PowerFinder.pwr(1,1) == 1;
    }

    @Test
    public void twoRaised_to_one_is_2() {
        assert PowerFinder.pwr(2,1) == 2;
    }

    @Test
    public void two_power_2_is_4() {
        assert PowerFinder.pwr(2, 2) == 4;
    }

    @Test
    public void power_of_2_and_3_Is_SIX() {
        assert PowerFinder.pwr(3, 2) == 3*3;
    }
}
