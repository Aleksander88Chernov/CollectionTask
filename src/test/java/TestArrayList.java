import org.junit.*;
import org.junit.rules.ExpectedException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class TestArrayList {
    MyArrayList<String> arrayList = new MyArrayList();
    MyArrayList<String> array = new MyArrayList();

    String one = "test1", two = "test2";
    String three = "test3", four = "test4";



    @Test
      public void testAddValue()
    {

        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        System.out.println(arrayList.get(two));


    }

    @Test
    public void testAddIndexAndValue(){

        arrayList.add(0,three);

    }

    @Test
    public void testGetSize(){
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        System.out.println(arrayList.getSize());
    }


    @Test
    public void testGetLength(){
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(one);
        arrayList.add(two);
        System.out.println(arrayList.getLength());

    }

    @Test
    public void testRemoveIndex(){
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.remove(2);
        System.out.println(arrayList.get(2));


    }
    @Test
    public void testRemoveValue(){
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.removeByValue(two);
        System.out.println(arrayList.get(two));

    }
    @Test
    public void testFastRemoveIndex(){
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.fastRemove(2);
        System.out.println(arrayList.get(2));
    }

    @Test
    public void testGetValue(){

        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        System.out.println(arrayList.get(three));


    }


    @Test
    public void testGetIndex(){

        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        System.out.println(arrayList.get(2));

    }

    @Test
    public void testTrimToSize(){

        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);;
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.remove(1);
        arrayList.remove(2);
        arrayList.remove(3);
        System.out.println(arrayList.getSize());
        System.out.println(arrayList.getLength());
        arrayList.trimToSize();
        System.out.println(arrayList.getSize());
        System.out.println(arrayList.getLength());

    }
    @Test
    public void testSort(){
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        array.add(one);
        array.add(two);
        array.add(three);
        array.add(four);
        arrayList.sort();

    }

}
