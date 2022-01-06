import org.junit.*;
import org.junit.rules.ExpectedException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class TestList {
    @Test
    private void checkIndex ( int index, int size){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(String.valueOf(index));
    }
}
