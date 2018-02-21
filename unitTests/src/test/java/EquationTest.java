import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTest {

    @Test
    public void test1() {
        Equation e = new Equation(1, 1, 1);
            Assert.assertEquals(e.rootNumber(), 0);

    }
    @Test
    public void test2() {
        Equation e = new Equation(1, 8, 1);
        Assert.assertEquals(e.rootNumber(), 2);

    }

}
