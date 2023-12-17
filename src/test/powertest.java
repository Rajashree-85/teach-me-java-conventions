package powerpackage;


import org.junit.Test;

public class powerFindertest {
    @Test
    public void oneRaisedPowerOneisOne() {
        assert powerFinder.powerFinderOfNumber(1,1) == 1;
    }

    @Test
    public void twoRaisedPowerOneisTwo() {
        assert powerFinder.powerFinderOfNumber(2,1) == 2;
    }

    @Test
    public void twoRaisedPowerTwoisTwo() {
        assert powerFinder.powerFinderOfNumber(2, 2) == 4;
    }

    @Test
    public void threeRaisedPowerTwoisSix() {
        assert powerFinder.powerFinderOfNumber(3, 2) == 3*3;
    }
}
