
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;





public class TestLinkedList {
    MyLinkedList<String> list = new MyLinkedList<>();

    String one = "test1", two = "test2";
    String three = "test3", four = "test4";

    @Test
    public void testSize() {

        list.add(one);
        list.add(two);
        System.out.println(list.size());
    }

    @Test
    public void testIsEmpty(){
        list.add(one);
        list.add(two);
        System.out.println(list.isEmpty());
    }


}
