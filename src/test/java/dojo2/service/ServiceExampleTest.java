package dojo2.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServiceExampleTest {

    private final ServiceExample example = new ServiceExample();

    @Test
    void addition() {
        assertEquals(2, example.something());
    }
}
