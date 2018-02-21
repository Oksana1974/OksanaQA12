import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {

    @Test
    public void testRectangle(){
        Rectangle r = new Rectangle(8.7,1.1);
        Assert.assertEquals(r.area(), 9.57);
    }
}
