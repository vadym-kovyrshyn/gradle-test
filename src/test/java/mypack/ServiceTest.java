package mypack;

import org.junit.*;

public class ServiceTest {
    @Test
    public void testMessage() {
        String str = new Service().getMessage();
        System.out.println("MESSAGE " + str);
        Assert.assertEquals(str, "2 b | ! 2 b");
    }
}
