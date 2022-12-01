package step.com.aqa.maven.example.test;

import org.junit.jupiter.api.BeforeAll;

public class BaseTestClass implements PropertiesReader {
    @BeforeAll
    public void readProperties () {
        readPropertiesFile();
    }

}
