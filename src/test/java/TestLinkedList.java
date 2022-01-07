
import org.junit.Assert;
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
    public void testIsEmpty() {
        list.add(one);
        list.add(two);
        System.out.println(list.isEmpty());
    }

    @Test
    public void noNull() {
        list.add(one);
        list.add(two);
        Assert.assertNotNull(list);
    }
    @Test
    public void testPrintList() {
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.printList();
    }
    @Test
    public void testContains(){
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        System.out.println(list.contains(two));
    }

    @Test
    public void testAddValue(){
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.printList();

    }

    @Test
    public void testAddValueIndex(){
        list.add(0,one);
        list.add(1,two);
        list.add(2,four);
        list.add(3,three);
        list.printList();


    }
    @Test
    public void testNode(){
        list.add(0,one);
        list.add(1,two);
        list.add(2,four);
        list.node(1);

    }
    @Test
    public void testRemoveIndex(){
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.remove(3);
        list.printList();

    }

    @Test
    public void testRemoveValue(){
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.remove(two);
        list.printList();
    }

    @Test
    public void testSort(){
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(two);
        list.add(three);
        list.add(one);
        list.add(two);
        list.printList();
        list.sort();
        list.printList();
    }

}