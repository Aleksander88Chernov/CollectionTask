import org.junit.*;
import org.junit.rules.ExpectedException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class TestArrayList {

    @Test
      public void testAddValue()
    {
        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add("test1");
        arrayList.add("test1");


    }

    @Test
    public void testAddIndexAndValue(){
        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add(0,"2");

    }

    @Test
    public void testGetSize(){
        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.getSize();
    }


    @Test
    public void testGetLength(){
        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.getLength();

    }

    @Test
    public void testRemoveIndex(){
        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add("test1");
        arrayList.add("test1");
        arrayList.add("test1");
        arrayList.remove(1);


    }
    @Test
    public void testRemoveValue(){
        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        arrayList.removeByValue("test2");
        System.out.println(arrayList.get("test2"));

    }

    @Test
    public void testGetValue(){

        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        System.out.println(arrayList.get("test3"));

    }

    @Test
    public void testGetIndex(){

        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        System.out.println(arrayList.get(2));

    }

    @Test
    public void testTrimToSize(){
        MyArrayList<String> arrayList = new MyArrayList();
        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        arrayList.add("test1");
        arrayList.remove(1);
        arrayList.remove(2);
        arrayList.remove(3);
        System.out.println(arrayList.getSize());
        System.out.println(arrayList.getLength());
        arrayList.trimToSize();
        System.out.println(arrayList.getSize());
        System.out.println(arrayList.getLength());

    }

}
