import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

    @Test
    public void testSquareArea(){
        Square s = new Square(7);
        Assert.assertEquals(s.area(), 49);
    }
}
