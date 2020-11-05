import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumOfRangeTest {
    private static SumOfRange sumOfRange;

    @BeforeClass
    public static void createSumOfRangeObject(){
        sumOfRange = new SumOfRange();
    }

    @Test(timeout = 1000)
    public void sumShouldBeNotNegative(){
        int a = sumOfRange.sum(10,12);
        Assert.assertFalse(a < 0);
    }

    @Test
    public void sumShouldBeTest1(){
        int a = sumOfRange.sum(9,12);
        Assert.assertEquals(a,42);
    }
}
