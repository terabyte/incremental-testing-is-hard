package ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ClassLoader;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;

import ex.Example;

public class ExampleTest {

    @Test
    public void someMethodTest() {
        Example.someMethod();
        String result = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("crap.txt"))).lines().collect(Collectors.joining("\n"));
        Assert.assertEquals("correct", result);
    }
}
