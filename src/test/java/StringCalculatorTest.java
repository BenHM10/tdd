import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    static StringCalculator stringCalculator;

    @BeforeAll
    public static void init(){
        stringCalculator = new StringCalculator();
    }

    @Test
    public void test1(){
        Assertions.assertEquals(3, stringCalculator.add("1,2"));
    }
    @Test
    public void test2(){
        Assertions.assertEquals(0, stringCalculator.add(""));
    }
    @Test
    public void test3(){
        Assertions.assertEquals(5, stringCalculator.add("3,2"));
    }
    
}
