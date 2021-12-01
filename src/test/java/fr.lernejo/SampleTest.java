package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTest {

    @Test
    void op() {
        assertEquals(11, new Sample().op(Sample.Operation.ADD, 5, 6));
        assertEquals(30, new Sample().op(Sample.Operation.MULT, 5, 6));
    }

    @Test
    void fact() {
        assertEquals(24, new Sample().fact(4));
        assertThrows(IllegalArgumentException.class,() -> new Sample().fact(-1));
    }
}
