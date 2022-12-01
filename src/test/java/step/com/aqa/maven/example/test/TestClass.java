package step.com.aqa.maven.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClass extends BaseTestClass{

    @Test
    public void testMethod () {
        String url = System.getProperty("base-url");
        Assertions.assertEquals("http:\\\\google.com", url);
    }
}
