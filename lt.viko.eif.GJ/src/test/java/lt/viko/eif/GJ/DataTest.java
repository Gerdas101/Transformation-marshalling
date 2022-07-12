package lt.viko.eif.GJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    private Data data;

    @BeforeEach
    void setUp() {
        data = new Data();
    }

    @Test
    void create() {
        assertNotNull(data.create());
    }
}